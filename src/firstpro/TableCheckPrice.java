package firstpro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCheckPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]")).click();
		//If price prrsent in 1st page
		/*
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> price=driver.findElements(By.xpath("//tr/td[1]/following-sibling::td[1]"));
		//List<String>original=new ArrayList<String>();
	
			for(int i=0;i<elementsList.size();i++) {
				
				String items=elementsList.get(i).getText();
				
				if(items.contains("Brinjal")) {
					System.out.println(price.get(i).getText());
				}			
			}*/
//			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	
			//If price prrsent in any page:
		List<String> price;
			do {
			List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
			price=elementsList.stream().filter(s -> s.getText().contains("Mango"))
					.map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			
			if(price.size()<1)
			{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			}while(price.size()<1);
	
		}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String pv=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pv;
	}				
}

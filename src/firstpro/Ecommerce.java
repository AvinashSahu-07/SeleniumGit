package firstpro;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] items= {"Brocolli","Cucumber","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		getItems(driver,items);
		driver.findElement(By.cssSelector("[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}
		
		public static void getItems(WebDriver driver,String[] items) 
		{
			int j=0;
			List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
			List itemsList=Arrays.asList(items);
			
			for(int i=0;i<products.size();i++) {
				String[] name=products.get(i).getText().split("-");
				String formattedName=name[0].trim();
				
				if(itemsList.contains(formattedName)) {
					j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==items.length)
					break;
				}					
			}		
		}
}


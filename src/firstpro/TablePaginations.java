package firstpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablePaginations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//check table items are sorted or not(1st way):
		
		/*driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(originalList, sortedList);*/
		
		//check table items are sorted or not(2nd way):
		
		/*driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		List<String>original=new ArrayList<String>();
		List<String> temp=new ArrayList<String>();
		
		for(WebElement ele:elementsList) {
			original.add(ele.getText());
			temp.add(ele.getText());
		}
		Collections.sort(temp);
		Assert.assertEquals(original, temp);*/
	
		
		
	
		

	}

}

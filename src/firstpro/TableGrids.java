package firstpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableGrids {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.cssSelector("div[class='tableFixHead'] table td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
	int total=Integer.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		if(sum==total) {
			System.out.println("Mathched");
		}
		else {
			System.out.println("UnMathched");
		}
	}

}

package firstpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launching edge browser by using webdriver manager
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
				
		//Launching chrome browser by using webdriver manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//call string method
		
		String pwd=getPassword(driver);

		//open url and fill input,pwd and click signin button and
		//different locators
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']"));
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passTxt=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] passArray=passTxt.split("'");
		String password=passArray[1].split("'")[0];
		return password;
		
	}

}

package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssTwo {

	public static void main(String[] args) {
		// Dropdown and locators assignment
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Avinash");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select ele=new Select(dropdown);
		ele.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio2")).click();		
		driver.findElement(By.cssSelector("[name='bday']")).sendKeys("23/02/1999");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		
		
		
		


	}

}

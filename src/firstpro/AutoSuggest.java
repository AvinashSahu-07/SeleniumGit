package firstpro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*driver.findElement(By.id("autosuggest")).sendKeys("tur");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("Turkmenistan")) {
				option.click();
				break;
			}
		}*/
		
		//Single checkbox:
		/*System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());*/
	
		//All checkboxes:		
		/*List<WebElement> items=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		for(WebElement item:items) {
			Thread.sleep(2000);
				item.click();
				break;
				}*/	
	}

}

package firstpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Static dropdown:
		
		/*WebElement StaticDrp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(StaticDrp);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		
		//Dropdown with loop without select tag:
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//loop for click 4 times
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}	
		driver.findElement(By.id("btnclosepaxoption")).click();*/
		
		//dynamic dropdown
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='AMD']")).click();		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();*/
		
		//Handle current date calendar
		
		/*driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();*/
		
		
		
		

	}

}

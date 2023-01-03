package firstpro;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Invoking new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		//Handle new tab by window handles
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String Parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		driver.get("https://rahulshettyacademy.com/");
		String name=driver.findElements(By.cssSelector("a[href*='core-java']")).get(1).getText();
		driver.switchTo().window(Parent);
		WebElement abc=driver.findElement(By.cssSelector("input[name='name']"));
		abc.sendKeys(name);
				
		//screenshot of partial page
		File source=abc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("logo.png"));
		
	}

}

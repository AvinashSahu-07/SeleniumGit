package firstpro;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerSection=driver.findElement(By.className("gf-t"));
		//System.out.println(footerSection.findElements(By.tagName("a")).size());
		
		WebElement footerColSection=footerSection.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul[1]"));
		//System.out.println(footerColSection.findElements(By.tagName("a")).size());
		
		int count=footerColSection.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++) {
			String clickLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColSection.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
		}
			Set<String> ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}		
	}

}

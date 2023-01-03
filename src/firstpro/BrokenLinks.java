package firstpro;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		SoftAssert ass=new SoftAssert();
		List <WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int code=conn.getResponseCode();
			System.out.println(code);
			if(code>400) {
				
				System.out.println("The link with text"+link.getText()+"is broken with code"+code);
				ass.assertTrue(false);
			}
		}
		ass.assertAll();
		

	}

}

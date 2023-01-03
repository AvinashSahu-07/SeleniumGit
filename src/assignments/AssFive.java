package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();

        String text=  driver.switchTo().alert().getText();

        if(text.contains(opt))

        {

       System.out.println("Alert message success");

        }

        else

       System.out.println("Something wrong with execution");

   
		
	}

}

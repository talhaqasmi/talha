package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"  , "C:\\Users\\4407\\Desktop\\SELINIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='menu-item-27580']")); 
		Actions select=new Actions(driver);
		select.moveToElement(dropdown).perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"menu-item-27582\"]/a/span[2]"));
		
		
		WebElement dropp=driver.findElement(By.xpath("//*[@id=\"menu-item-27582\"]/a/span[2]"));
		Actions drp=new Actions(driver);
		drp.moveToElement(dropp).perform();
		driver.findElement(By.cssSelector("#menu-item-27583 > a > span.menu-text")).click();
		
		
		
		

		
		

	}

}

package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {
	public static void main(String[]args) {
		//browser driver path
		System.setProperty("webdriver.chrome.driver"  , "C:\\Users\\4407\\Desktop\\SELINIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://github.com/login");
		//WebElement unm=driver.findElement(By.id("login_field"));
		//unm.sendKeys("m.talhatanveer786@gmail.com");
		
		//WebElement anm=driver.findElement(By.id("password"));
		//anm.sendKeys("Talha143143");
		driver.findElement(By.id("login_field")).sendKeys("m.talhatanveer786@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Talha143143");
		
		driver.findElement(By.name("commit")).click();
		String actualTitle=driver.getTitle();
		if (actualTitle.contains("GitHub")) {
			System.out.println("Test passed successfully");
		}
		else {
			System.out.println("Test Failed");
		}
		
		
	}

}
 
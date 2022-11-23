package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"  , "C:\\Users\\4407\\Desktop\\SELINIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/login");
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("body > main > div > div > a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_name")).sendKeys("talhaqasmi");
		driver.findElement(By.id("user_email")).sendKeys("tanveer@gmail.com");
		driver.findElement(By.id("password")).sendKeys("qwerty123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("/html/body/main/div/form/div[6]/input")).click();
		
		

	}

}

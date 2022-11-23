package day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver"  , "C:\\Users\\4407\\Desktop\\SELINIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[4]/a")).click();

	}

}

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
		String origional=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		driver.switchTo().window(origional);
		
	
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(origional);
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(2);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(origional);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(3);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(origional);
		driver.close();
		
		

	}

}

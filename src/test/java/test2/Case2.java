package test2;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Case2 implements Data{

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.dealsdray.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    //driver.findElement(By.xpath("//button[@type='button']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[@class=' MuiBox-root css-psy1y7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(location);   //data in interface
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();                           //popup
		
		Screenshort.caputecher(driver,"image.jpeg");  //screen short
		
		driver.quit();
		
		

	}

}

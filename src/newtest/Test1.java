package newtest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	 public static void main(String[] args) {

		 

    System.setProperty("webdriver.chrome.driver","/home/qainfotech/chromedriver");
	WebDriver driver = new ChromeDriver();
	 
	
	driver.navigate().to("http://mail.google.com");
	
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	 driver.findElement(By.cssSelector("#identifierId")).sendKeys("dhruvverma557@gmail.com");
		
	  driver.findElement(By.cssSelector("#identifierNext > content")).click();
	  
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
	  driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("dhruvsharda");
	  
	  WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(Keys.ENTER);
	  
	
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	    driver.findElement(By.xpath("//*[@class='zA zE']")).click();
		
	    String Body = driver.findElement(By.cssSelector("div[class='ii gt']")).getText();
		
		driver.findElement(By.cssSelector("div[role='button'][gh='cm']")).click();
		
		driver.findElement(By.name("to")).sendKeys("harshtiger18@gmail.com");
		
		driver.findElement(By.name("subjectbox")).sendKeys("Automation Demo");
		
		driver.findElement(By.cssSelector("div[aria-label='Message Body']")).sendKeys(Body);
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
		
		driver.findElement(By.cssSelector("a[href*='https://accounts.google.com/Logout']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		driver.quit();
	 
	  
	  }

}



	 
	
   
	 

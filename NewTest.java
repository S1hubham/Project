package rediffTest;

import org.testng.annotations.Test;

import io.netty.util.AsciiString;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
 public static WebDriver driver;
	 
@Test
  public void rediffTest() throws InterruptedException {
	Thread.sleep(1000);
  // String [][] array = new String[5][5]; 
 //   String portFolio = array[1][0];
	 driver.findElement(By.xpath("//*[@id=\'createPortfolio\']/img")).click();
		driver.findElement(By.xpath("//*[@id=\'create\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'create\']")).sendKeys("Large Cap Stock");
		driver.findElement(By.xpath("//*[@id=\'createPortfolioButton\']")).click();

 
		Thread.sleep(1000);
     	driver.findElement(By.xpath("//*[@id=\'createPortfolio\']/img")).click();
		driver.findElement(By.xpath("//*[@id=\'create\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'create\']")).sendKeys("Mid Cap Stock");
		driver.findElement(By.xpath("//*[@id=\'createPortfolioButton\']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'createPortfolio\']/img")).click();
		driver.findElement(By.xpath("//*[@id=\'create\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'create\']")).sendKeys("Small Cap Stock");
		driver.findElement(By.xpath("//*[@id=\'createPortfolioButton\']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'createPortfolio\']/img")).click();
		driver.findElement(By.xpath("//*[@id=\'create\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'create\']")).sendKeys("Mutual Fund");

 		driver.findElement(By.xpath("//*[@id=\'createPortfolioButton\']")).click();

		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Selenium Testing\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("useremail"));
		uname.sendKeys("sbedmutha11@gmail.com");
		driver.findElement(By.id("userpass")).sendKeys("Shubham");
   	driver.findElement(By.id("loginsubmit")).click();
   	
   	
 }

  @AfterTest
  public void afterTest() {
	  
  }

}

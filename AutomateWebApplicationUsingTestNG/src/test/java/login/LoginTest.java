package login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				  "D:\\phase 5\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public void closeBrowser() {

		driver.quit();

	}

	public void performTest() throws InterruptedException {
		Thread.sleep(2000);
	      driver.get("https://www.facebook.com");
			System.out.println("Login Automation Started....");

	       driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
			System.out.println("Username is Entered.");

	        driver.findElement(By.id("pass")).sendKeys("ravi28394");
			System.out.println("Password is Entered");

	        driver.findElement(By.name("login")).click();
			System.out.println("Clicked On Login Button");

	}

	@Test
	public void loginTest() {

		LoginTest obj = new LoginTest();
		try {
			obj.launchBrowser();
			obj.performTest();
			obj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Testing is Going to start..");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Testing is Done!");
  }
}

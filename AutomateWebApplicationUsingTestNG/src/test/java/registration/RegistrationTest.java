package registration;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RegistrationTest {
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
		driver.get(
				"https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0NTIxNTM2LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		System.out.println("Facebok Opened in Browser");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Rishav");
		System.out.println("First Name Entered");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		System.out.println("Last Name Entered");
		driver.findElement(By.name("reg_email__")).sendKeys("rishav1729@gmail.com");
		System.out.println("Email id Entered");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rishav1729@gmail.com");
		System.out.println("Reentered Email Id");
		driver.findElement(By.id("password_step_input")).sendKeys("rishav!@#$");
		System.out.println("Password Entered");
		driver.findElement(By.name("birthday_day")).sendKeys("22");
		System.out.println("Birth Day Selected");
		driver.findElement(By.name("birthday_month")).sendKeys("7");
		System.out.println("Birth Month Selected");
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		System.out.println("Birth Year Selected");
		driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
		System.out.println("Sex Selected");
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);
		System.out.println("Clicked On SignUp Button");

	}

	@Test
	public void registrationTest() {
		RegistrationTest obj = new RegistrationTest();

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

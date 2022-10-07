package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	// TODO Auto-generated method stub
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			  "D:\\phase 5\\chromedriver_win32/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
		
		driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
		System.out.println("Login Automation Started....");

       driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
		System.out.println("Username is Entered.");

        driver.findElement(By.id("pass")).sendKeys("ravi28394");
		System.out.println("Password is Entered");

        driver.findElement(By.name("login")).click();
		System.out.println("Clicked On Login Button");

	


}
}

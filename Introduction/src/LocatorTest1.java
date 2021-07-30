import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Open facebook url in browser
		driver.get("https://www.facebook.com/");
		
//		find emailid edit box on landing page of facebook and enter email address
		driver.findElement(By.id("email")).sendKeys("demo@gmail.com");
		
//		find password edit box on landing page of facebook and enter password
		driver.findElement(By.name("pass")).sendKeys("123456");
		
//		find login button and click on it
//		driver.findElement(By.cssSelector("#u_0_b")).click();
		
//		find forgot password link and click on it 
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).click();
	
	}

}

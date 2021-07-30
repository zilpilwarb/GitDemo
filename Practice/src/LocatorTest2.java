
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.className("button r4 wide primary")).click();
		
		
//		get text of error message
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}

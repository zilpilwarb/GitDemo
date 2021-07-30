import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rediff.com/");

		driver.findElement(By.cssSelector("a[class*='signin']")).click();
		System.out.println("We have successfully clicked on Signin button on landing page");
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test@email.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
//		get the error message after invalid login thing
		System.out.println(driver.findElement(By.cssSelector("div[id*='div_login_error']")).getText());
		
		driver.close();
	}

}

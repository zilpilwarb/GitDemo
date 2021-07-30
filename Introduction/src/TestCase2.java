import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create driver object for firefox driver
		//Gecko driver download
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}

}

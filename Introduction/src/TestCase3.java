import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create driver object for Internet Explorer driver
		//InternetExplorer driver download
		System.setProperty("webdriver.ie.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create driver object for chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium WebDriver Learning\\Resource Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
//		validate if site title is correct
		System.out.println(driver.getTitle());
		
//		if you are landed on correct site
		System.out.println(driver.getCurrentUrl());
		System.out.println("Currently cursor is on Google");
		
//		print page source 
//		System.out.println(driver.getPageSource());
		
//		Navigate to anther url
		driver.get("https://yahoo.com");
		System.out.println("Currently cursor is on Yahoo");
		
//		Navigate back to previous url
		driver.navigate().back();
		System.out.println("Currently cursor is on Google");
		
		driver.close(); //Close closes current browser opened by selenium
		driver.quit(); //Quit closes all bowser opened by selenium
	}

}

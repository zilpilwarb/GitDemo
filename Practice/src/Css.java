import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Open salseforce url in browser
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("password");
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		
	}

}

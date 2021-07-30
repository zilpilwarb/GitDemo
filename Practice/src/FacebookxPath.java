import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookxPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium WebDriver Learning\\Resource Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Open facebook url in browser
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("my own xpath");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello@123");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.cssSelector("*[id='email']")).sendKeys("my own cssSelector");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello@123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}

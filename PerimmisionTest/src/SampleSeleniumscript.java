

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rajesh\\Java-Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("gmail.com");
		driver.findElement(null)

	}

}

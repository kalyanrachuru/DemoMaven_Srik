package generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

//import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners()
public class BaseTest implements IAUTOCONSTANTS {

	static {
	//	System.out.println(CHROME_KEY);
	//	System.out.println(CHROME_VALUE);
		//System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
	}

	public WebDriver driver;

	@BeforeMethod
	public void OpenBrowser() {
		// open chrome
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
	//	System.out.println("URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
}

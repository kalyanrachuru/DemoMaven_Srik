package Pages;
//package Pages;
//
//
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BS_14 {
//
////	static {
////		System.setProperty("webdriver.chromedriver", "./src/main/resoures/driver/chrome.driver.exe");
////		
////	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		// Entering the URL
//		driver.get("https://www.bluestone.com/");
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		//Moving the cursor to Offers  and Selecting 0 % making charges.
//		WebElement offers = driver.findElement(By.xpath("//a[.='Offers ']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(offers).perform();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='0% Making charge']")));
//		
//		//Verifying the product displaying is 0%
//		List<WebElement> productList = driver.findElements(By.xpath("//span[@class='new-price']"));
//		List<WebElement> productListWith0Charge = driver.findElements(By.xpath("//span[.='0% Making charge']"));
//		
//		System.out.println();
//		if (productList  == productListWith0Charge) {
//			System.out.println("Pass");
//		}
//		else
//			System.out.println("Fail");
//		
//		
//		
//		
//		
//	}
//
//}
//

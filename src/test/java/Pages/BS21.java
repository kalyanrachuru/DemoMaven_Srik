package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class BS21 extends BaseTest{

	@FindBy(xpath="//input[@name='search_query']")
	private WebElement searchRings;
	@FindBy(xpath="//input[@name='submit_search']")
	private WebElement searchClick;
	
	@FindBy(xpath="//section[@id='Price-form']")
	private WebElement searchPrice;

	@FindBy(xpath="//span[@data-displayname='below rs 10000']")
	private WebElement below10k;
	
	public void search() {
		searchRings.sendKeys("Rings");
	}
	
	public void searchclk(){
		searchClick.click();
	}
	
	public void priceMouseHover(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(searchPrice).perform();
	}
	
	public void priceText() {
		String s =  below10k.getText();
		System.out.println("price below 10k count = "+ s);
	}
		
	public BS21(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class BS25 extends BaseTest{

//	@FindBy(xpath="//input[@name='search_query']")
//	private WebElement searchRings;
//	@FindBy(xpath="//input[@name='submit_search']")
//	private WebElement searchClick;
//	@FindBy(xpath="//section[@id='Price-form']")
//	private WebElement searchPrice;


	
	@FindBy(xpath="//a[contains(text(),'Rings')]")
	private WebElement mouseHoverRings;
	
	
	@FindBy(xpath="//span[contains(text(),'Gender')")
	private WebElement findGender;
	
	@FindBy(xpath="//span[@data-displayname='women']")
	private WebElement womenCount;
	
//	public void search() {
//		searchRings.sendKeys("Rings");
//	}
//	
//	public void searchForRings() {
//		mouseHoverRings.click();
//	}
	
	public void genderMouseHover() {
		Actions act2 = new  Actions(driver);
		act2.moveToElement(findGender).click();
	}

	public void ringsMouseHover() {
		Actions act1 = new Actions(driver);
		act1.moveToElement(mouseHoverRings).click();
	}
	
	
	public void findWomenCount() {
		String s =  womenCount.getText();
		System.out.println("Women Count = "+ s);
	}
		
	public BS25(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
}

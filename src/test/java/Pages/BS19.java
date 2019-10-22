package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class BS19 extends BaseTest{

	@FindBy(xpath="//li[@class='menuparent gold-coins']")
	private WebElement goldcoins;
	@FindBy(xpath="//span[@data-p='l-gold-coins-weight-5gms,m']")
	private WebElement gram;
	
	@FindBy(xpath="//h1[@class='title-5']")
	private WebElement title;	
	
	public void weight_gram() {
		gram.click();
		
	}
	
	public void goldCoin(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(goldcoins).perform();
	}
	public void titleCoin() {
		String s = title.getText();
		if(s.equals("5 gram 24 KT Gold Coin")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	public BS19(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
}

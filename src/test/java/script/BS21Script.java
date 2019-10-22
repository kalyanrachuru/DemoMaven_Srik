package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS18;
import Pages.BS19;
import Pages.BS20;
import Pages.BS21;
import generic.BaseTest;

public class BS21Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS21 bs = new BS21(driver);
		bs.search();
		bs.searchclk();
		bs.priceMouseHover(driver);
		bs.priceText();
		
	}
}
	
package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS15;
import generic.BaseTest;

public class BS15Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS15 bs = new BS15(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}

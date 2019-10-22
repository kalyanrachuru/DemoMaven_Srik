package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS15;
import Pages.BS16;
import generic.BaseTest;

public class BS16Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS16 bs = new BS16(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}

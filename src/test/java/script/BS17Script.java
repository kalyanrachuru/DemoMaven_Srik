package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS15;
import Pages.BS16;
import Pages.BS17;
import generic.BaseTest;

public class BS17Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS17 bs = new BS17(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}

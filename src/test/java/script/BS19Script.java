package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS18;
import Pages.BS19;
import generic.BaseTest;

public class BS19Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS19 bs = new BS19(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}
	
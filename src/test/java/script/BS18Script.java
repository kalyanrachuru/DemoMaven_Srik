package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS18;
import generic.BaseTest;

public class BS18Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS18 bs = new BS18(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}
	
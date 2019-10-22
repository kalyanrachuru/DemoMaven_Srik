package script;

import org.testng.annotations.Test;

import Pages.BS14;
import generic.BaseTest;

public class BS14Script extends BaseTest{

	@Test
	public void oneGramGold() throws InterruptedException {
		BS14 bs = new BS14(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}

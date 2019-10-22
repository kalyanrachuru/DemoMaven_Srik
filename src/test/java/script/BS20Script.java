package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS18;
import Pages.BS19;
import Pages.BS20;
import generic.BaseTest;

public class BS20Script extends BaseTest{

	@Test
	public void oneGramGold() {
		BS20 bs = new BS20(driver);
		bs.goldCoin(driver);
		bs.weight_gram();
		bs.titleCoin();
		
	}
}
	
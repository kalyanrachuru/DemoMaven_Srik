package script;

import org.testng.annotations.Test;

import Pages.BS14;
import Pages.BS18;
import Pages.BS19;
import Pages.BS20;
import Pages.BS21;
import Pages.BS25;
import generic.BaseTest;

public class BS25Script extends BaseTest{

	@Test
	public void ringsWomenCount() {
		BS25 bs = new BS25(driver);
		bs.ringsMouseHover();
		
		bs.genderMouseHover();
		bs.findWomenCount();
		
	}
}
	
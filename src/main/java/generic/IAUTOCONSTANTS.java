package generic;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public interface IAUTOCONSTANTS {
	
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE= "./src/main/resources/driver/chromedriver.exe";
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./src/main/resources/driver/geckodriver.exe";
	String URL = "https://www.bluestone.com" ; //"http://localhost:8080/login.do";
	String XL_INPUT = "./data/input.xlsx";
	String PHOTO_PATH = "./photo/photo";
	String XL_REPORT = "./data/output.xlsx";
	long ITO = 10;
	long ETO = 10;
	
	
	
}

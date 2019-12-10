package automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\rashmiQA-Krishnatraining\\browserDriver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
			driver.get("https://www.orbitz.com/");

	}

}

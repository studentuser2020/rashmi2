package automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InterDriver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\rashmiQA-Krishnatraining\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		
		WebDriver idriver = new InternetExplorerDriver();
		//https://accounts.google.com/signin/v2/identifier?hl=en-GB&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession
		//https://policies.google.com/terms?gIUUl=US&hl=en-GB
		idriver.get("https://amazon.com");
		String etitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		idriver.navigate().refresh();
		idriver.navigate().back();
		idriver.navigate().forward();
		idriver.navigate().to("https://google.com");
	}

}

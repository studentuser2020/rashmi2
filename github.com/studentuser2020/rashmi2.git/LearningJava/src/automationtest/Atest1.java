package automationtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\rashmiQA-Krishnatraining\\browserDriver\\chromedriver.exe");
		
		// to Launch chrome browser
		WebDriver driver =  new ChromeDriver();
		driver.get("https://facebook.com");
		
		
		//String etitle = "Facebook - Log In or Sign Up";
		//String title = driver.getTitle();
		
		
	//	WebElement e1 = driver.findElement(By.id("email"));
	//	WebElement e1 = driver.findElement(By.name("email"));
	//	WebElement e1 = driver.findElement(By.className("inputtext login_form_input_box"));
	//	e1.sendKeys("Rashmi@gmail.com");
		
		WebElement p1 = driver.findElement(By.id("pass"));
		p1.sendKeys("password");
		p1.clear();
		
		WebElement falink =  driver.findElement(By.linkText("Forgot account?"));
		String linkvalue = falink.getAttribute("href");
		System.out.println(linkvalue);

		// get the value of given CSS value
	//	String afvalue = falink.getCssValue("font-family");
		//		System.out.println(afvalue);
		
		
		
	//	WebElement falink =  driver.findElement(By.partialLinkText("Forgot"));
//	falink.click();
		//list always have an order by.  and contains duplicate elements
		
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// for each -- pass the type same as the base list and then followed by colon and followed by the collection name
	//	for (WebElement link : links) {
		//	System.out.println(link.getAttribute("href"));
	//	}
		
	driver.get("https://post.craigslist.org/k/FJDz5mj_6RGJPGjZ5aWdrQ/jctUW?s=subarea");
	WebElement dc = driver.findElement(By.xpath("/html/body/article/section/form/ul/li[1]/label/input"));
	
		
	/*driver.get("https://google.com");
	WebElement about = driver.findElement(By.xpath("//*[@id = 'hptl']/a[1]"));
	String gt = about.getTagName();
	System.out.println(gt);
	
	String gtest = about.getText();
	System.out.println(gtest);
	
	
	
	Point p = about.getLocation();
	int px = p.x;
	int py = p.y;
	System.out.println(px + py);
	
	Dimension gs = about.getSize();
	int gh =gs.height;
	int gw = gs.width;
	
	System.out.println("gs + gw ");
		
		*/
		/*if (title.equals(etitle)) {
			System.out.println("TC1 is Pass");
		}
		else {
			System.out.println ("Test Case 1 is failed");
		}
		
		String actuacurl = driver.getCurrentUrl();
		System.out.println(actuacurl);
		
		String actualpagesoure = driver.getPageSource();
		System.out.println(actualpagesoure);
				
		System.out.println(title);
		
		//WebElement link = driver.findElement(By.ByXPath("terms-link))"
	try {
		Thread.sleep(1000);
	}
	catch (InterruptedException e){
		e.printStackTrace();
	}
	
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://google.com");
		//driver.close();
		//driver.quit();
		*/

		
	}

}

package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\rashmiQA-Krishnatraining\\browserDriver\\chromedriver.exe");

 	// To launch Chrome browser
		WebDriver driver =  new ChromeDriver();
 			driver.get("https://www.orbitz.com/");
  
		 WebElement flyfrom = driver.findElement(By.xpath("//*[@id='package-origin-hp-package']"));
				flyfrom.sendKeys("IAD");
		 WebElement flyto = driver.findElement(By.xpath("//*[@id='package-destination-hp-package']"));
		 		flyto.sendKeys("ATL");
		 WebElement dpartdate = driver.findElement(By.xpath("//*[@id='package-departing-hp-package']"));
		 		dpartdate.sendKeys("12/12/2019");
		 WebElement rdate = driver.findElement(By.xpath("//*[@id='package-returning-hp-package']"));
				 rdate.clear();
				 rdate.submit();
				 rdate.sendKeys("01/05/2020");
 
		 WebElement roomdw =  driver.findElement(By.xpath("//*[@id='package-rooms-hp-package']"));
				 Select room =  new Select(roomdw);
				 room.selectByIndex(0);
				 //room.selectByVisibleText("2");
				 //room.selectByValue("2");
		 WebElement adultdw = driver.findElement(By.xpath("//*[@id='package-1-adults-hp-package']"));
			  	Select adult = new Select(adultdw);
			  	adult.selectByValue("2");
		 WebElement childdw = driver.findElement(By.xpath("//*[@id='package-1-children-hp-package']"));
		 		Select childbox = new Select(childdw);
		 		childbox.selectByVisibleText("2");
		 WebElement prefereddw = driver.findElement(By.xpath("//*[@id='package-advanced-preferred-class-hp-package']"));
		 		Select preferclass = new Select(prefereddw);
		 		preferclass.selectByIndex(3);
  
 
	}

}

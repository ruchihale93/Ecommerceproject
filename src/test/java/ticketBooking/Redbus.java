package ticketBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Redbus {
  @Test
  public void RedbusTest() throws InterruptedException {
	  
	  {

		  WebDriver driver=new ChromeDriver();
		  Reporter.log("Opening Redbuss", true);
		  driver.get("https://www.redbus.com/");
		  Thread.sleep(7000);
		  driver.close();
	  
	  }
  }
}

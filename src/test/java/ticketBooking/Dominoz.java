package ticketBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dominoz {
  @Test
  public void f() throws InterruptedException {
	  {

		  WebDriver driver=new ChromeDriver();
		  Reporter.log("Opening Dominos", true);
		  driver.get("https://www.dominos.co.in/");
		  Thread.sleep(7000);
		  driver.close();
	  
	  }
  }
}

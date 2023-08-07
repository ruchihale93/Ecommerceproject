package ticketBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_12_Meeshow {
  @Test
  public void Meeshowtest() throws InterruptedException {
	  


	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening amazon", true);// yes taking another side
	  driver.get("https://www.meesho.com/");
	  Thread.sleep(3000);
	  driver.quit();
  
  
  }
}

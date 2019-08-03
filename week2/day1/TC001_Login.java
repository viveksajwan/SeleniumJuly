package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001_Login {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // Set the runtime enviromental //
																						// path for the driver
		ChromeDriver driver = new ChromeDriver(); // To Launch the browser
		driver.get("http://leaftaps.com/opentaps"); // To Load the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesManager"); // Enter the Username
		driver.findElementById("password").sendKeys("crmsfa"); // Enter the Password
		driver.findElementByClassName("decorativeSubmit").click(); // Click the Login Button
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sarath");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");

		// for drop down
		WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
		Select sc = new Select(eleSource);
		sc.selectByIndex(2);
//		sc.selectByVisibleText("Cold Call");
//		sc.selectByValue("LEAD_COLDCALL");

		// For getting the size of the drop down list
		List<WebElement> options = sc.getOptions();
		System.out.println(options.size());

		
		
		
		
//		WebElement ele = driver.findElementById("createLeadForm_dataSourceId");
		WebElement ele = driver.findElementById("createLeadForm_firstName");

		Select sel = new Select(ele);
//		

//		driver.findElementByClassName("smallSubmit").click();

//		driver.close(); // Close the browser

	}
}

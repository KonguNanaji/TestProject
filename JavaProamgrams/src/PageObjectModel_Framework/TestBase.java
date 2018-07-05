package PageObjectModel_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver=null;
	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANAJI\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		//To maximize the browser
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//To launch the browser
		driver.get("https://www.facebook.com/");
		
		}
	@AfterSuite
	public void TeardownTest()
	{
		//TestBase.driver.quit();
	}

}

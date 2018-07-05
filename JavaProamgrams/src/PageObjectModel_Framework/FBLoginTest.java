package PageObjectModel_Framework;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FBLoginTest extends TestBase {
	@Test
	public void init() {
		FBLogin_Page loginpage=PageFactory.initElements(driver,FBLogin_Page.class);
		loginpage.Setusername("9676763057");
		loginpage.SetPassword("jinana");
		loginpage.clickloginButton();
		FB_HomePage fbhomepage=PageFactory.initElements(driver,FB_HomePage.class);
		fbhomepage.clickdropdownsetting();
		fbhomepage.clicklogoutdropdown();
	}
	

}

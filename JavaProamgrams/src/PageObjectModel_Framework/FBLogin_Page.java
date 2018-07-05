package PageObjectModel_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;

public class FBLogin_Page {
	WebDriver driver;
	public  FBLogin_Page(WebDriver driver) 
	{
		this.driver=driver;
	}
@FindBy(xpath="//*[@id=\"email\"]")
WebElement FB_Username;
@FindBy(xpath="//*[@id=\"pass\"]")
WebElement FB_Password;
@FindBy(xpath="//*[@id=\"u_0_2\"]")
WebElement FB_Login;
public void Setusername(String setemail) {
	FB_Username.sendKeys(setemail);
}
public void SetPassword(String setpasword) {
	FB_Password.sendKeys(setpasword);
}
public void clickloginButton() {
	FB_Login.click();
}
//public void popups() {
//	@FindBy(xpath="")
//}
}


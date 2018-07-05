package PageObjectModel_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_HomePage {
	WebDriver driver;
	public FB_HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
//	@FindBy(xpath="//div[@id=\"userNavigationLabel\"]")
//	WebElement dropdownmenu;
	@FindBy(xpath="//a[@href=\"https://www.facebook.com/settings\"]")
	WebElement FBSettingDropdown;
	@FindBy(xpath="//*[@id=\"js_1x\"]/div/div/ul/li[12]/a/span/span")
	WebElement LogoutButton;
	
	
	public void clickdropdownsetting() {
		FBSettingDropdown.click();	
	}
	
	public void clicklogoutdropdown() {
		LogoutButton.click();
	}
}

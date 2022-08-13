package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public  HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
@FindBy (xpath =("//a[text()='Demo'][1]"))
private WebElement demo;

@FindBy (xpath= ("//a[@class='btn btn-black navbar-btn']"))
private WebElement logout;


public void demo() {
	demo.click();
	System.out.println("Sheetal raibole selected in MNC");
	System.out.println("Sandi and Harshu selected in MNC");
	System.out.println("Sandi and Harshu hike selected in MNC");
	System.out.println("Praty hard");
	System.out.println("Praty party hard");

	}

public void clickOnLogout() {
	logout.click();
}
	
	
	
}
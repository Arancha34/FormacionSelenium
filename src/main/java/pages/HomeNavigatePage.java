package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeNavigatePage extends BasePage {
	
	   public HomeNavigatePage (WebDriver driver){
		   super(driver);  
		}
	   
	   By WebSignIn = By.xpath("//a[@class='login']");	
	   
	   public void click() {
	    	click(WebSignIn);
	    }
	   
}

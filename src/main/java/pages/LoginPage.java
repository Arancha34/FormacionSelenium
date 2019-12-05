package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	By WebEmail = By.xpath("//input[@id='email']");
	By WebPwd = By.xpath("//input[@id='passwd']");
	By WebButtonSubmit = By.xpath("//p[@class='submit']//span[1]");

	public LoginPage(WebDriver driver){
		// TODO Auto-generated constructor stub
		super(driver); 
	}
	public void rellenoEmail(String texto) {
		writeText(WebEmail,texto);
    }
	public void rellenoPwd(String texto) {
		writeText(WebPwd,texto);
    }
	public void pulsoSubnit() {
    	click(WebButtonSubmit);
    }
}

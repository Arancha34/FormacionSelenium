package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuComprasPage extends BasePage{
	By WebLogout = By.xpath("//a[@class='logout']");
	By WebUsuarioConectado = By.xpath("//a[@class='account']");
	By WebMenuWoman = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
	
	public MenuComprasPage(WebDriver driver){
		// TODO Auto-generated constructor stub
		super(driver); 
	}
	public boolean existeEnlace() {
		boolean bexiste;
		bexiste = existElement(WebLogout);
		return bexiste;
	}
	public void mostrarUsuario() {
		System.out.print("Usuario: " + readText(WebUsuarioConectado) );
	}
	public void clicMenu() {
		click(WebMenuWoman);
	}
}

package testCompra;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.ArticulosWoman;
import pages.BasePage;
import pages.HomeNavigatePage;
import pages.LoginPage;
import pages.MenuComprasPage;


public class testNavigate {
	public WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BasePage NavigateShop = new BasePage(driver);
		HomeNavigatePage home = new HomeNavigatePage(driver);
		LoginPage login =  new LoginPage(driver);
		MenuComprasPage compras =  new MenuComprasPage(driver);
		ArticulosWoman articulo  = new ArticulosWoman (driver);
		
		home.click();
		login.rellenoEmail("mailuser@mail.com");
		login.rellenoPwd("12345");
		login.pulsoSubnit();
		assertTrue(compras.existeEnlace());
		compras.mostrarUsuario();
		compras.clicMenu();
		articulo.miroArticulo();
		
	}

}

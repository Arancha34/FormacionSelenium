package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArticulosWoman extends BasePage {
	public ArticulosWoman(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By Webli = By.xpath("//div[@id='subcategories']//li");
	By Webli1 = By.xpath("//div[@id='subcategories']//li[1]");
	By WebCamisetaCompra = By.xpath("//span[contains(text(),'Add to cart')]");
	By WebCamisetaVerdad =By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]");
	
	public void miroArticulo() {
		
		List  articulos = driver.findElements(By.xpath("//div[@id='subcategories']//li"));
		List  articulosCamiseta;
        System.out.println("No of cols are : " +articulos.size()); 
        //No.of rows 
        if (articulos.size() > 0) {
        	click(Webli1);
        	 System.out.println("dd");
          // 	 String ColumnText = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th["+i+"]")).getText();
        
        	 articulosCamiseta = driver.findElements(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]"));
        	 System.out.println("No of cols are : " +articulosCamiseta.size()); 
        	 if (articulosCamiseta.size() > 0)  {
        		 click(WebCamisetaVerdad);
        		 System.out.println("escogido");
        		 click(WebCamisetaCompra);
        	 }
        }
    }
	
	
}

package Wappi.Paginas;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Wappi.Steps.Botones;

public class Compras {
	
	private WebDriver driver;
	private Botones botones = new Botones (driver);
	
	public Compras(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		
}
	
	@FindBy(how = How.LINK_TEXT, using = "Información personal")
	private WebElement InfoPersonal;
	
	@FindBy(how = How.ID, using = "name")
	private WebElement Nombre;
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement Apellido;
	
	@FindBy(how = How.ID, using = "country")
	private WebElement Pais;
	
	@FindBy(how = How.ID, using = "//option[contains(text(),'Colombia')]")
	private WebElement colombia;
	
	@FindBy(how = How.ID, using = "image")
	private WebElement imagen;
	
	@FindBy(how = How.ID, using = "save-profile")
	private WebElement save;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"confirmation-modal\"]/div/span")
	private WebElement cerrar;		
	
	@FindBy(how = How.XPATH, using = "//body/app-root[1]/app-profile[1]/app-user-confirmation-modal[1]/div[1]/div[1]")
	private WebElement Exito;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[@id='offer-0']/td[7]")
	private WebElement PedirACeite;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"offer-0\"]/td[2]")
	private WebElement ACeite;
	
	@FindBy(how = How.ID, using = "order-confirm")
	private WebElement Pedir;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[@id='offer-1']/td[7]/button[1]")
	private WebElement PedirPan;	
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[@id='offer-2']/td[7]/button[1]")
	private WebElement PedirJamon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"offer-1\"]/td[2]")
	private WebElement PAN;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"offer-2\"]/td[2]")
	private WebElement Jamon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"order-2\"]/td[2]")
	private WebElement ACeiteResumen;	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"order-0\"]/td[2]")
	private WebElement PanResumen;	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"order-1\"]/td[2]")
	private WebElement JamonResumen;	
		
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Mis pedidos')]")
	private WebElement Pedidos;
	
	@FindBy(how = How.ID, using = "welcome-coupon")
	private WebElement Cupon;
	
	@FindBy(how = How.ID, using = "coupon-code")
	private WebElement Codigo;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Inicio')]")
	private WebElement Inicio;
		
	@FindBy(how = How.XPATH, using = "//*[@id=\"coupon-modal\"]/div/span[1]")
	private WebElement CerrarCodigo;
	
	@FindBy(how = How.ID, using = "coupon")
	private WebElement UsarCupon;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"offer-modal\"]/div/span")
	private WebElement CerrarError;
	  

	public void  Infoirmación () throws Throwable{	
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		InfoPersonal.click();
		botones.scrollBajar();
		Thread.sleep(2000);
		
		//////////////////////////////////CAPTURA DE PANTALLA
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\jesus\\Desktop\\Prueba Wappi\\WAPPI\\target\\site\\serenity\\InfoActual.png"));
		
		String NameInit = Nombre.getAttribute("innerText");	
		System.out.println("el nombre inicial es");
		System.out.println(NameInit);
		
		Nombre.clear();
		Nombre.sendKeys("NewName");
		String NameFin = Nombre.getAttribute("innerText");	
		System.out.println(NameFin);
		Apellido.clear();
		Apellido.sendKeys("NuevoApellido");
		//Pais.click();		
		//colombia.click();
		
		
		//cargar archivo
		imagen.click();
		//los robot para control v
		
		 StringSelection ss = new StringSelection("C:\\test.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
		 
		 Robot robot = new Robot();
		 robot.delay(250);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.delay(800);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.delay(800);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(4000);
		 save.click();
		 
		 driver.close();
		 
	//	 File Info = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	 FileUtils.copyFile(file, new File("C:\\Users\\USUARIO\\Desktop\\WAPPI\\target\\site\\serenity\\Infonueva.png"));
		
        }


	public void  CompraSinCupon () throws Throwable{	
		WebDriverWait wait = new WebDriverWait(driver,10); 		

		String DescipAceiteOferta = ACeite.getAttribute("innerText");	
		String DescipPanOferta = PAN.getAttribute("innerText");	
		String DescipJamonOferta = Jamon.getAttribute("innerText");	
					  
		PedirACeite.click();	
		Pedir.click();
		cerrar.click();
		
		
		PedirPan.click();
		Pedir.click();
		cerrar.click();
		
		
		PedirJamon.click();
		Pedir.click();
		cerrar.click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(PedirACeite));
		Thread.sleep(2000);
		File Lista = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Lista, new File("C:\\Users\\jesus\\Desktop\\Prueba Wappi\\WAPPI\\target\\site\\serenity\\Lista de productos.png"));
		Pedidos.click();
		Thread.sleep(2000);
		File Agregados = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Agregados, new File("C:\\Users\\jesus\\Desktop\\Prueba Wappi\\WAPPI\\target\\site\\serenity\\Productos agregados.png"));
		Pedidos.click();
		
		String Desciption1 = ACeiteResumen.getAttribute("innerText");	
		String Desciption2 = PanResumen.getAttribute("innerText");	
		String Desciption3 = JamonResumen.getAttribute("innerText");
		
						
		if(DescipAceiteOferta.equals(Desciption1)    ){			
					
			if  (DescipPanOferta.equals(Desciption2)  )
			{
							
			   }
				if  (DescipJamonOferta.equals(Desciption3)  ){
				
				System.out.println("El pedido realizado  concuerda con los productos elegidos");

				System.out.println(Desciption2);
			}
				
			}
			
			   else{
				   
				  System.out.println("El pedido realizado NO concuerda con los productos elegidos");
				  

			}
		
	}
	
	
	public void  CompraConCupon () throws Throwable{
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
		
			
		Cupon.click();
		/// TOMAR CUPON (TEXTO)
		String CodigoCupon = Codigo.getAttribute("innerText");
		System.out.println(CodigoCupon);
		CerrarCodigo.click();
		
		
		Inicio.click();
		PedirACeite.click();			
		UsarCupon.sendKeys(CodigoCupon);
		Pedir.click();		
		cerrar.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(PedirPan));
		PedirPan.click();			
		UsarCupon.sendKeys(CodigoCupon);
		Pedir.click();		
		cerrar.click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(PedirJamon));
		PedirJamon.click();			
		UsarCupon.sendKeys(CodigoCupon); 		
		Pedir.click();/// SE DEBE EVIDENCIAR ERROR DE CUPON (SOLO SE PUEDE USAR DOS VECES)	
		Thread.sleep(2000);
		/// CAPTURA DE PANTALLA ERROR DE CUPON
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\USUARIO\\Desktop\\WAPPI\\target\\site\\serenity\\Error cupon.png"));
		
		CerrarError.click();
		Pedidos.click();
		
		driver.close();
	
		
	}
	
	
}
	
	



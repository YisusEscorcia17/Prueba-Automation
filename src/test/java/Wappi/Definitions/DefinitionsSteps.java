package Wappi.Definitions;

import org.openqa.selenium.WebDriver;

import Wappi.Paginas.*;
import Wappi.Steps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();	
	private Botones botones = new Botones (driver);
	private Compras compras = new Compras (driver);

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@Then("^Iniciar sesion con usuario y contrasena$")
public void diligenciarloscampos ( )throws Throwable {	
	 this.botones = new Botones(driver);    
      this.botones.LogIn();   
}


@When("^Actualizar información del cliente$")
public void Actualizar_informacion_del_cliente() throws Throwable {
	 this.compras = new Compras(driver); 
	 this.compras.Infoirmación();

}

@When("^realizar compra sin cupon$")
public void realizar_compra_sin_cupon() throws Throwable {
	
	 this.compras = new Compras(driver); 
	 this.compras.CompraSinCupon();
	
	
}
@When("^realizar compra con cupon$")
public void realizar_compra_con_cupon() throws Throwable {
	
	 this.compras = new Compras(driver); 
	 this.compras.CompraConCupon();
	
	
}
 

}
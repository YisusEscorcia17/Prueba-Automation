package Wappi.Steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class Botones {
	
private WebDriver driver;
	
	@FindBy(how = How.ID, using = "username")
	private WebElement User;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement pass;
	
	@FindBy(how = How.ID, using = "button-login")
	private WebElement login;
	
	
	public Botones(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
}
	

	//login 
	
	@Step
public   void LogIn () {		
		User.sendKeys("usuarioNuevo");
		pass.sendKeys("ContraseñaNue");
		login.click();		
	}
	
			
	@Step
	public void scrollBajar() {		
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
	       scroll.executeScript("window.scrollBy(0,250)");	        		        
	}
	
}

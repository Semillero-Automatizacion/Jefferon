package com.jeffer.app.ejemploPom.pageObjects;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")

public class Login_pageObject extends PageObject {
	

	String txt_Usuario="//input[@placeholder='Username']";
	public void ingresar_usuario(String usuario)  {
		find(By.xpath(txt_Usuario)).sendKeys(usuario);
	}
	
	String txt_Contrasena="//input[@placeholder='Password']";
	public void ingresar_contraseña(String contrasena) throws Exception {
		find(By.xpath(txt_Contrasena)).sendKeys(contrasena);
	}
	
	String txt_Boton="//button[@class='btn btn-lg btn-primary btn-block']";
	public void click_en_boton_ingresar() throws Exception {
		find(By.xpath(txt_Boton)).click();
	}
	
	String txt_Validacion=" //h1[@id='bootstrap-admin-template']";
	public String se_valida_el_ingreso_correcto() throws Exception {
		   return find(By.xpath(txt_Validacion)).getText().substring(0, 9);
	}
	
}

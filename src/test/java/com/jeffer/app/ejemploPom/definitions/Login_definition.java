package com.jeffer.app.ejemploPom.definitions;

import com.ibm.icu.impl.LocaleDisplayNamesImpl.DataTable;
import com.jeffer.app.ejemploPom.steps.Login_steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class Login_definition {
	
	@Steps
	Login_steps login_steps;
	
	@Given("^Ingreso al navegador$")
	public void ingreso_al_navegador()   {
		login_steps.ingreso_a_navegador();
	}

	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Exception {
	   login_steps.ingreso_usuario(usuario);
	}

	@When("^Ingresar contraseña \"([^\"]*)\"$")
	public void ingresar_contraseña(String contrasena) throws Exception {
	   login_steps.ingreso_contraseña(contrasena);
	}

	@When("^Click en boton ingresar$")
	public void click_en_boton_ingresar() throws Exception {
	    login_steps.click_en_boton();
	}

	@Then("^Se valida el ingreso correcto$")
	public void se_valida_el_ingreso_correcto() throws Exception {
	   Assert.assertEquals("Bootstrap", login_steps.validacion());
	}

}



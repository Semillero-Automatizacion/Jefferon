package com.jeffer.app.ejemploPom.definitions;

import com.jeffer.app.ejemploPom.steps.ValidacionFormulario_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class validacionFormulario_definitions {
	@Steps
	ValidacionFormulario_steps validacion_steps;
	
	@Given("^Ingresar sesion \"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_sesion(String usuario, String contrasena) throws Exception  {
		validacion_steps.ingreso_sesion(usuario, contrasena);
	}
	
	@When("^Diligenciar formulario\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"(.*)\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void diligenciar_formulario(String required, String seleccion, String url, String password, String field, String field2, String number, String ip, String fecha, String fechaanterior) throws Exception {
	   validacion_steps.llenar_formulario(required, seleccion, url, password, field, field2, number, ip, fecha, fechaanterior);
	}

	@Then("^validar el formulario$")
	public void validar_el_formulario() throws Exception {
		Assert.assertEquals(false, validacion_steps.verificar_campos_diligenciados());
	    Thread.sleep(20000);
	}
}

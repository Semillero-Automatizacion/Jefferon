package com.jeffer.app.ejemploPom.steps;

import com.jeffer.app.ejemploPom.pageObjects.Login_pageObject;

import net.thucydides.core.annotations.Step;

public class Login_steps {
	
	Login_pageObject login_pageObject;
	
	@Step
	public void ingreso_a_navegador() {
		login_pageObject.open();
	}
	
	@Step 
	public void ingreso_usuario(String usuario) {
		login_pageObject.ingresar_usuario(usuario);
	}
	
	@Step
	public void ingreso_contraseña (String contrasena) throws Exception {
		login_pageObject.ingresar_contraseña(contrasena);
	}
	
	@Step 
	public void click_en_boton () throws Exception {
		login_pageObject.click_en_boton_ingresar();
	}
	
	@Step
	public String validacion() throws Exception {
		return login_pageObject.se_valida_el_ingreso_correcto();
	}
}

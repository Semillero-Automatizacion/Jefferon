package com.jeffer.app.ejemploPom.steps;

import com.jeffer.app.ejemploPom.pageObjects.Login_pageObject;
import com.jeffer.app.ejemploPom.pageObjects.validacionFormulario_pageObject;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;

public class ValidacionFormulario_steps {
	Login_pageObject ob;
	validacionFormulario_pageObject pageObj;
	
	@Step
	public void ingreso_sesion(String usuario, String contrasena) throws Exception {
	ob.getDriver().manage().window().maximize();
	ob.ingresar_usuario(usuario);
	ob.ingresar_contraseña(contrasena);
	ob.click_en_boton_ingresar();
	
	}
	
	@Step
	public void llenar_formulario(String required, String seleccion, String url, String password, String field, String field2, String number, String ip, String fecha, String fechaanterior) throws Exception {
	   pageObj.boton_Formelement();
	   pageObj.boton_validation();
	   pageObj.campo_Required(required);
	   pageObj.campo_deporte(seleccion);
//	   Thread.sleep(200);
	   pageObj.campo_multiple();
	   pageObj.campo_url(url);
	   pageObj.campo_email();
	   pageObj.campo_password(password);
	   pageObj.campo_password2(password);
	   pageObj.campo_field(field);
	   pageObj.campo_field2(field2);
	   pageObj.campo_number(number);
	   pageObj.campo_ip(ip);
	   pageObj.campo_fecha(fecha);
	   pageObj.campo_fechaAnterior(fechaanterior);
	   pageObj.boton_validar();
	}
	public boolean verificar_campos_diligenciados() {
		return pageObj.campos_emergentes();
	}
}

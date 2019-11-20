package com.jeffer.app.ejemploPom.pageObjects;

import java.nio.file.Files;
import java.util.Random;

import org.apache.tools.ant.types.resources.comparators.Exists;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class validacionFormulario_pageObject extends PageObject {
	
	String txt_FormElements="//a[@class='dropdown-toggle']";
	String txt_Lista="//ul[@class='dropdown-menu']//a[contains(text(),'Validation')]";
	String txt_Required="//*[@id=\"req\"]";
	String txt_seleccion="//select[@id='sport']";
	String txt_multiple="//select[@id='sport2']//option[contains(text(),'Golf')]";
	String txt_url="//input[@id='url1']";
	String txt_email=" //input[@id='email1']";
	String txt_password="//input[@id='pass1']";
	String txt_password2="//input[@id='pass2']";
	String txt_field="//input[@id='minsize1']";
	String txt_field2="//input[@id='maxsize1']";
	String txt_number="//input[@id='number2']";
	String txt_ip="//input[@id='ip']";
	String txt_date="//input[@id='date3']";
	String txt_dateEarlier="//input[@id='past']";
	String txt_validar="//form[@id='popup-validation']//input[@class='btn btn-primary']";
	String txt_emergentes="//*[@id=\"popup-validation\"]/div//div/div/div[1]";
	
	
	public void boton_Formelement () {
		find(By.xpath(txt_FormElements)).click();
	}
	
	public void boton_validation() {
		find(By.xpath(txt_Lista)).click();
	}
	
	public void campo_Required(String required) {
		find(By.xpath(txt_Required)).click();
		find(By.xpath(txt_Required)).sendKeys(required);
	}
	
	public void campo_deporte(String seleccion) {
		find(By.xpath(txt_seleccion)).selectByVisibleText(seleccion);
	}
	
	public void campo_multiple() {
		find(By.xpath(txt_multiple)).click();
		
	}
	
	public void campo_url(String url) {
		find(By.xpath(txt_url)).click();
		find(By.xpath(txt_url)).sendKeys(url);
	}
	
	public void campo_email() {
		Random r = new Random();
		String correo = null;
		int a;
		char[] c = new char[8];
		for (int i=0;i<7;i++) {
		c[i] =(char)(r.nextInt(26) +'a');
		correo=correo+c[i];
		}
		a=r.nextInt(100);
		correo=correo+a;
		find(By.xpath(txt_email)).click();
		find(By.xpath(txt_email)).sendKeys(correo+"@gmail.com");
	}
	
	public void campo_password(String password) {
		find(By.xpath(txt_password)).sendKeys(password);
	}
	
	public void campo_password2(String password) {
		find (By.xpath(txt_password2)).sendKeys(password);
	}
	
	public void campo_field(String field) {
		find(By.xpath(txt_field)).clear();
		find(By.xpath(txt_field)).sendKeys(field);
	}
	
	public void campo_field2(String field2) {
		find(By.xpath(txt_field2)).clear();
		find(By.xpath(txt_field2)).sendKeys(field2);
	}
	
	public void campo_number(String number) {
		find(By.xpath(txt_number)).clear();
		find(By.xpath(txt_number)).sendKeys(number);
	}
	
	public void campo_ip(String ip) {
		find(By.xpath(txt_ip)).sendKeys(ip);
	}
	
	public void campo_fecha(String fecha) {
		find(By.xpath(txt_date)).clear();
		find(By.xpath(txt_date)).sendKeys(fecha);
	}
	
	public void campo_fechaAnterior(String fechaanterior) {
		find(By.xpath(txt_dateEarlier)).clear();
		find(By.xpath(txt_dateEarlier)).sendKeys(fechaanterior);
	}
	
	public void boton_validar() {
		find(By.xpath(txt_validar)).click();
	}
	
	public boolean campos_emergentes() {
		return find(By.xpath(txt_emergentes)).isVisible();
	}
	
	
	
	
}

package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RegistroPage extends PageObject {

    By txtNombre = By.id("register.firstName");

    By txtApellido = By.id("register.lastName");

    By txtMobil = By.id("register.mobileNumber");

    By btnRegistrar = By.className("js-btn-register-myaccount");

    By cbeAutorizacion = By.xpath("//input[@type='checkbox' and @id='registerChkTermsConditions']");


    public By getTxtNombre() {
        return txtNombre; }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtMobil() {
        return txtMobil;  }

    public By getBtnRegistrar() {
        return btnRegistrar;
    }

    public void hacerClicCheckbox() {
        WebElement checkbox = getDriver().findElement(cbeAutorizacion);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled')", checkbox);
        checkbox.click();
    }

}

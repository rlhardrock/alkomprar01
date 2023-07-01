package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegistroPage extends PageObject {

    By txtNombre = By.id("register.firstName");

    By txtApellido = By.id("register.lastName");

    By txtMobil = By.id("register.mobileNumber");

    By btnRegistrar = By.className("js-btn-register-myaccount");

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

    By checkboxLocator = By.xpath("//input[@id='registerChkTermsConditions']");

    public void hacerClicCheckbox() {
        WebElement checkbox = getDriver().findElement(checkboxLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled')", checkbox);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(checkbox).click().perform();
    }

}

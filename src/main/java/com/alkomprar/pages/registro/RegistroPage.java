package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistroPage extends PageObject {

    By txtNombre = By.id("register.firstName");

    By txtApellido = By.id("register.lastName");

    By txtMobil = By.id("register.mobileNumber");

    By btnRegistrar = By.xpath("//button[@class='button-primary btn-block js-btn-register-myaccount' and @type='submit']");

    //  public By getBtnRegistrar() {  return btnRegistrar;     }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtMobil() {
        return txtMobil;
    }

    By checkboxLocator = By.xpath("//input[@id='registerChkTermsConditions']");

    public void hacerClicCheckbox() {
        WebElement checkbox = getDriver().findElement(checkboxLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled')", checkbox);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(checkbox).click().perform();
    }

    public void clicContinuar() {
       WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(btnRegistrar));
        button.click();
    }
}
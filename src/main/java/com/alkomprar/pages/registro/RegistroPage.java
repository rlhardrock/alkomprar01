package com.alkomprar.pages.registro;

import com.alkomprar.utils.HabilitarCheckbox;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends PageObject {

    WebDriver driver = new ChromeDriver();
    HabilitarCheckbox checkbox = new HabilitarCheckbox();

    @FindBy(id = "registerChkTermsConditions")
    private WebElement checkboxElement;

    public RegistroPage() {
        this.driver = driver;
        checkbox = new HabilitarCheckbox();
    }

    public By habilitarCheckbox() {
        checkbox.habilitarCheckbox(checkboxElement);
        return null;
    }


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
}

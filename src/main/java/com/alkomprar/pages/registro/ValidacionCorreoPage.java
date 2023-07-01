package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidacionCorreoPage extends PageObject {

    By txtCorreo = By.xpath("//input[@id='js-login-email']");

    By btnContinuar = By.xpath("//button[@id='js-login-continue']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }
}

package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CuentaPage extends PageObject {

    By ttlCuenta = By.xpath("//div[contains(text(),'Mi cuenta')]");

    By TtlSesion = By.className("account-section-header visible module-title");

    public By getTtlCuenta() {
        return ttlCuenta;
    }

    public By getTtlSesion() {
        return TtlSesion;
    }
}

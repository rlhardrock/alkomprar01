package com.alkomprar.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CuentaPage extends PageObject {

    By ttlCuenta = By.xpath("//div[contains(text(),'Mi cuenta')]");

    public By getTtlCuenta() {
        return ttlCuenta;
    }

}

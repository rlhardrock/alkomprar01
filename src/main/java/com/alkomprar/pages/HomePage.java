package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By btnCuenta = By.id("js-myaccount-header");

    public By getBtnCuenta() {
        return btnCuenta;
    }
}

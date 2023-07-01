package com.alkomprar.utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HabilitarCheckbox {

    private WebDriver driver;

    public HabilitarCheckbox() {
        this.driver = driver;
    }

    public void habilitarCheckbox(WebElement checkboxElement) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].removeAttribute('disabled')", checkboxElement);
    }

}

package com.alkomprar.steps;

import net.thucydides.core.annotations.Step;
import com.alkomprar.pages.CuentaPage;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CuentaStep {

    CuentaPage cuenta = new CuentaPage();

    @Step
    public void validarTitulo(){
        Assert.assertThat(
                "",
                cuenta.getDriver().findElement(cuenta.getTtlCuenta()).isDisplayed(),
                Matchers.is(true)
        );
    }
}

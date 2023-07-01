package com.alkomprar.steps.registro;

import net.thucydides.core.annotations.Step;
import com.alkomprar.pages.registro.CuentaPage;
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

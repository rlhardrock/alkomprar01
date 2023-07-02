package com.alkomprar.steps.registro;

import net.thucydides.core.annotations.Step;
import com.alkomprar.pages.registro.CuentaPage;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CuentaStep {

    CuentaPage cuenta = new CuentaPage();

    @Step
    public void validarTitulo(){
        String tituloEsperado = "Mi cuenta";
        String tituloActual = cuenta.getDriver().findElement(cuenta.getTtlCuenta()).getText();
        Assert.assertEquals(tituloEsperado, tituloActual);
    }
}

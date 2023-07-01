package com.alkomprar.steps;

import com.alkomprar.pages.ValidacionCorreoPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class ValidacionCorreoStep {

    ValidacionCorreoPage validacion = new ValidacionCorreoPage();
    Excel excel = new Excel();

    @Step()
    public void escribirCorreo() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","credenciales");
        validacion.getDriver().findElement(validacion.getTxtCorreo()).sendKeys(informacionPersonal.get(0).get("email"));
    }

    @Step()
    public void confirmarCorreo(){

        validacion.getDriver().findElement(validacion.getBtnContinuar()).click();
    }
}

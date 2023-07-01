package com.alkomprar.steps;

import com.alkomprar.pages.RegistroPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class RegistroStep {

    RegistroPage credenciales = new RegistroPage();
    Excel excel = new Excel();

    @Step()
    public void enviarNombre() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","credenciales");
        credenciales.getDriver().findElement(credenciales.getTxtNombre()).sendKeys(informacionPersonal.get(0).get("nombre"));
    }

    @Step()
    public void enviarApellido() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","credenciales");
        credenciales.getDriver().findElement(credenciales.getTxtApellido()).sendKeys(informacionPersonal.get(0).get("apellido"));
    }

    @Step()
    public void enviarMobil() throws IOException {
        ArrayList<Map<String, String>> informacionPersonal = excel.leerDatosDeHojaDeExcel("src/test/resources/data/informacion.xlsx","credenciales");
        credenciales.getDriver().findElement(credenciales.getTxtMobil()).sendKeys(informacionPersonal.get(0).get("numero"));
    }

    @Step()
    public void autorizar(){
        credenciales.getDriver().findElement(credenciales.habilitarCheckbox()).click();
    }

    @Step()
    public void registrar(){
        credenciales.getDriver().findElement(credenciales.getBtnRegistrar()).click();
    }

}

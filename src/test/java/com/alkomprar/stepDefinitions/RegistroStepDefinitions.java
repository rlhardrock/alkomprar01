package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.CuentaStep;
import com.alkomprar.steps.HomeStep;
import com.alkomprar.steps.RegistroStep;
import com.alkomprar.steps.ValidacionCorreoStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinitions {

    @Steps
    HomeStep comenzar;

    @Steps
    ValidacionCorreoStep validar;

    @Steps
    RegistroStep registar;

    @Steps
    CuentaStep comparar;

    @Dado("abro la pagina web Alkomprar")
    public void abrirPaginaWebAlkomprar() {
;       comenzar.abrirNavegador();
    }

    @Cuando("hago click en MiCuenta e ingreso la informacion solicitada en los formularios siguientes")
    public void completarFormularios() throws IOException {
        comenzar.clicMiCuenta();
        validar.escribirCorreo();
        validar.confirmarCorreo();
        registar.enviarNombre();
        registar.enviarApellido();
        registar.enviarMobil();
        registar.autorizar();
        registar.registrar();
    }

    @Entonces("visualizo el tablero de control MiCuenta")
    public void vizualizarMiCuenta() {
        comparar.validarTitulo();
    }
}

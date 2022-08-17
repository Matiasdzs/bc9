package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.RumboHomePage;
import desafio.grupo1.rumbo.testcreation.pages.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrenesTest extends SeleniumTestBase {
    
    Trenes trenes;

    @BeforeEach
    public void inicializar(){
        trenes = new Trenes(DriverFactory.getDriver());
        trenes.navegarAlHome();
        trenes.aceptarCookies();
    }
    @Test
    public void irASeccionTrenes() {
    }

    @Test
    @Description ("ID:T03- Crear viaje en Tren, filtrar por el más barato")
    public void viajeMasBarato() {
        trenes.seccionTrenes();
        trenes.viajeTrenFiltro();
    }

    @Test
    @Description("ID: T01 - Viaje en tren sin destino")
    public void buscarViajeTren() throws InterruptedException {
        trenes.seccionTrenes();
        trenes.viajeEnTrenSinDestino();
        Assertions.assertEquals("Selecciona ciudad de destino", trenes.msjErrorDestino());
    }

}

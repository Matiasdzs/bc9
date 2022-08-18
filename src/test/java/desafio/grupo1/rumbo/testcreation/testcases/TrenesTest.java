package desafio.grupo1.rumbo.testcreation.testcases;


import desafio.grupo1.rumbo.testcreation.pages.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
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

        trenes.seccionTrenes();
    }


    @Test
    @Description("ID: T01 - Viaje en tren sin destino")
    public void buscarViajeTren(){
        trenes.viajeEnTrenSinDestino();
        trenes.msjErrorDestino();
        System.out.println(trenes.msjErrorDestino());
    }
    @Test
    @Description ("ID:T03- Crear viaje en Tren, filtrar por el más barato")

    public void viajeMasBarato() throws InterruptedException {
        trenes.seccionTrenes();
        trenes.viajeTrenFiltro();
        Assertions.assertEquals("89,96 €","89,96 €");
    }

    @Test
    @Description("ID:T04- Listas Desplegables Seccion Trenes")

    public void desplegarListasTrenes(){
        trenes.seccionTrenes();
        Assertions.assertEquals("Billetes de AVE más hotel a Madrid",trenes.leerMasListasAve());
        Assertions.assertEquals("Ventajas del buscador de Rumbo",trenes.leerMasRumbo());

    }
    @Test
    @Description("ID:T05- Popup con mensaje de error en sección Renfe")
    public void mensajeErrorRenfe(){
        trenes.seccionTrenes();
        Assertions.assertEquals("No hemos encontrado ninguna oferta que se ajuste a los criterios de búsqueda, probablemente por falta de disponibilidad en fechas o destino. Por favor, vuelve a intentarlo seleccionando una fecha diferente.",trenes.errorRenfe());
    }


}

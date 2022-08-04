package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import aut.testcreation.pages.GoogleHomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class atc01_BusquedasEnGoogle extends SeleniumTestBase {


    GoogleHomePage googleHomePage;

    @Test
    void busquedaGoogleTsoft(){
        //Acciones a realizar
        googleHomePage= new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.ingresarAHomePage();
        googleHomePage.buscarEnBarraGoogle("Tsoft");

        //validacion
        String titulo = googleHomePage.getUrlTitle();
        Assertions.assertEquals("Tsoft - Buscar con Google", titulo);

    }
}

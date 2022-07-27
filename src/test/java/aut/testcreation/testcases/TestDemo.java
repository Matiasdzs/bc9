package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static aut.engine.utils.Constants.BASE_URL_AUT;

public class TestDemo extends SeleniumTestBase {

    WebDriver driver; // browser

    @Test
    @Description("Test creado para bootcamp 9 tsoft")
    public void testDemo() throws InterruptedException {
        //Inicializacion
        driver = DriverFactory.getDriver(); // Crear el browser de la prueba.

        //abrir webpage
        driver.get(BASE_URL_AUT); //google.com
        //traer valor en string de la url
        String nombreUrlActual= driver.getCurrentUrl();

        //traer valor de la pestaña
        String nombreTitulo= driver.getTitle();
        System.out.println("Me encuentro en: "+nombreUrlActual+ "y su titulo es: "+nombreTitulo);
        Thread.sleep(2000);


        driver.navigate().to("https://www.selenium.dev"); //abre la webpage indicada en el archivo config
         nombreUrlActual= driver.getCurrentUrl();
         nombreTitulo= driver.getTitle();
        System.out.println("Me encuentro en "+nombreUrlActual+ "y su titulo es: "+nombreTitulo);


        //browser - back- forward - refresh
        driver.navigate().back();
        nombreUrlActual= driver.getCurrentUrl();
        nombreTitulo= driver.getTitle();
        System.out.println("Me encuentro en "+nombreUrlActual+ "y su titulo es: "+nombreTitulo);
        driver.navigate().forward();
        nombreUrlActual= driver.getCurrentUrl();
        nombreTitulo= driver.getTitle();
        System.out.println("Me encuentro en "+nombreUrlActual+ "y su titulo es: "+nombreTitulo);
        driver.navigate().refresh();

        Thread.sleep(2000);
        Assertions.assertTrue(true);
    }
}
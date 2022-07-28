package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpdigitalTest extends SeleniumTestBase {
    WebDriver driver;
    //Localizadores
    By buscador= By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/span[1]/form/div/input");
    By btnBuscar= By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div/span[1]/form/div/button");
    By msjNoEncontrado= By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[4]/section[1]/div/div[2]/div[2]/span[1]");

    @Test
    public void testSpdigital() throws InterruptedException {
    driver= DriverFactory.getDriver();
    driver.navigate().to("https://www.spdigital.cl");

    WebElement webElementbuscador= driver.findElement(buscador);
    WebElement webElementbtnBuscar= driver.findElement(btnBuscar);

    webElementbuscador.sendKeys("asdfgh");

    webElementbtnBuscar.click();
    Thread.sleep(5000);

    WebElement webElementmsjNoEncontrado= driver.findElement(msjNoEncontrado);
    String respuesta= webElementmsjNoEncontrado.getText();


    Assertions.assertEquals("0 - 0 de 0 productos para tu búsqueda: \"asdfgh\"",respuesta);
    }
}

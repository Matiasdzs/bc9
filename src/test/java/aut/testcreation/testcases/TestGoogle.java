package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class TestGoogle extends SeleniumTestBase {
    WebDriver driver;

    @Test
    @Description("Test para practicar Selenium en google")

    public void testGoogle() throws InterruptedException {
        driver= DriverFactory.getDriver();
        driver.navigate().to("https://www.google.com");

        //respuestas en el driver
        String url = driver.getCurrentUrl();
        String titulo= driver.getTitle();
        String pageSource= driver.getPageSource();
        String handle= driver.getWindowHandle();

        //find by xpath
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(url);

        //find by classname
        //driver.findElement(By.className("gLFyf")).sendKeys(url);

        //find by tagname
        //driver.findElement(By.tagName("input")).sendKeys(url);

        //Encontrar la barra, escribir y presionar boton Buscar, volver hacia atras, hacia adelante y cerrar
        /*driver.findElement(By.className("gLFyf")).sendKeys(url);
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();*/




        Thread.sleep(3000);
        Assertions.assertTrue(true);


    }
}

package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static aut.engine.utils.Constants.BASE_URL_AUT;

public class LocalizadoresTest extends SeleniumTestBase {

    WebDriver driver;
    //Localizadores
    By btnEnviarA= By.cssSelector(".nav-menu-cp");
    By popElegiDondeRecibir= By.id("root-app");
    By cerrarPopElegi = By.cssSelector(".andes-modal-dialog");
    By btnEntendido = By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]");


    @Test
    void localizandoElementos(){
        driver= DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);

        //ya deberia estar disponible el elemento web

        if(driver.findElement(btnEntendido).isEnabled()){
            driver.findElement(btnEntendido).click();
        }
        WebElement webElementbtnEnviarA = driver.findElement(btnEnviarA);
        if(webElementbtnEnviarA.isDisplayed()){
            String text = webElementbtnEnviarA.getText();
            System.out.println(text);
            webElementbtnEnviarA.click();
        }

        if(driver.findElement(popElegiDondeRecibir).isEnabled()){
            WebElement webElementCerrarPop= driver.findElement(cerrarPopElegi);
            webElementCerrarPop.click();
        }



    }
}

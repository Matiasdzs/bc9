package aut.testcreation.pages;

import aut.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static aut.engine.utils.Constants.BASE_URL_AUT;

public class GoogleHomePage extends SeleniumWrapper {

    //Declaracion de Locators
    By barraBusquedaLocator= By.name("q");
    By botonBuscarLocator= By.name("btnK");

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    //Metodos de la pagina
    public void ingresarAHomePage(){
        navigateTo(BASE_URL_AUT);
    }
    public void buscarEnBarraGoogle(String texto){
        write(texto,barraBusquedaLocator);
        click(botonBuscarLocator);

    }
}

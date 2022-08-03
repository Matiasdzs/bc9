package aut.testcreation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ManejoWebElements {
    WebDriver driver;
    By dropdownLocator = By.id("dropdown");
    By check1= By.xpath("//input [@type=\"checkbox\"][1]");
    By check2= By.xpath("//input [@type=\"checkbox\"][2]");
    By btnEnabledLocator= By.xpath("//li[@id=\"ui-id-3\"]/a");
    By btnDownloadLocator= By.xpath("//li[@id='ui-id-4']/a");
    By btnPDFLocator= By.xpath("//li[@id='ui-id-5']/a");
    By iframe= By.id("mce_0_ifr");
    By iframeText= By.id("tinymce");

    By dueTable1= By.xpath("//table[@id=\"table1\"]/descendant::span[contains(text(),'Due')]");





    @BeforeAll
    static void init(){
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    void setup(){
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    //Dropdown
    @Test
    void dropdown(){
        System.out.println("------ Test dropdown ------");
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        //WebElement
        WebElement dropdown= driver.findElement(dropdownLocator);
        //Select
        Select select = new Select(dropdown);

        select.selectByValue("1");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(1);
        select.selectByIndex(2);
    }

    @Test
    void checkboxes(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //WebElement
        WebElement checkbox1= driver.findElement(check1);
        WebElement checkbox2= driver.findElement(check2);

        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        if(checkbox2.isSelected()) {
        checkbox2.click();
        }

    }

    @Test
    void menuDinamico() {
        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");

        WebElement btnEnabled = driver.findElement(btnEnabledLocator);
        WebElement btnDownload = driver.findElement(btnDownloadLocator);
        WebElement btnPDF = driver.findElement(btnPDFLocator);

        if (btnPDF.isDisplayed()) {
            btnPDF.click();
        }
        if (btnDownload.isDisplayed()) {
            btnDownload.click();
        }
        if (btnEnabled.isDisplayed()) {
            btnEnabled.click();
            btnDownload.click();
            btnPDF.click();
        }
    }

    @Test
    void iframes(){
            driver.navigate().to("https://the-internet.herokuapp.com/tinymce");

            //Traernos todos los iframes de una pagina
            List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
            driver.switchTo().frame(iframes.get(0));
            System.out.println(iframes.size());
            WebElement iframeTextElement=driver.findElement(iframeText);
            iframeTextElement.clear();
            iframeTextElement.sendKeys("Hola");
        }

    @Test
    void webTables() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        //Traer elementos que contiene la tabla
        List<WebElement> webTable = driver.findElements(By.id("table1"));

        //Traer las Columnas
        List<WebElement> columnas = webTable.get(0).findElement(By.tagName("thead")).findElements(By.tagName("th"));
        System.out.println(columnas.size());

        //Clickeando 2 veces "due"
        WebElement dueWE = driver.findElement(dueTable1);

        if (dueWE.isDisplayed()) {
            dueWE.click();
            dueWE.click();
        }

        //Traer las Filas
        List<WebElement> filas = webTable.get(0).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        //Buscar deudor
        String nombre= filas.get(0).findElement(By.xpath("td[2]")).getText();
        String apellido= filas.get(0).findElement(By.xpath("td[1]")).getText();
        String deuda= filas.get(0).findElement(By.xpath("td[4]")).getText();
        System.out.println("El cliente con mas deuda es: " +nombre+" "+apellido+" y la deuda es " + deuda);

        }








    @AfterEach
    void close(){
        driver.quit();
    }
}

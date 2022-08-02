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

import java.time.Duration;
import java.util.List;

public class TraductorTest {
    WebDriver driver;
    By textArea= By.xpath("//textarea[@class=\"er8xn\"]");
    By btnIngles= By.xpath("(//div[@jsname='rPx1uf']/div[@data-language-code='en'])[2]");
    By btnFrances= By.xpath("(//div[@jsname='rPx1uf']/div[@data-language-code='fr'])[2]");
    By btnPortugues= By.xpath("(//div[@jsname='rPx1uf']/div[@data-language-code='pt'])[2]");

    By btnDialogo = By.xpath("//button[contains(text(),'NO, GRACIAS')]");
    By desplegarLista= By.xpath(" (//button[@jsname='zumM6d'])[1]");



    @BeforeAll
    static void init(){
        WebDriverManager.edgedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test
   void testGoogle() throws InterruptedException {
        System.out.println("--- Test Google ---");
        driver.navigate().to("https://translate.google.com.ar/?hl=es");
        String ventana= driver.getWindowHandle();

        WebElement textAreaElement= driver.findElement(textArea);
        WebElement btnInglesElement= driver.findElement(btnIngles);
        WebElement btnFrancesElement= driver.findElement(btnFrances);
        WebElement desplegarListaWE= driver.findElement(desplegarLista);
        WebElement btnPortuguesWE= driver.findElement(btnPortugues);


        List<WebElement> iframes= driver.findElements(By.name("callout"));
        driver.switchTo().frame(iframes.get(0));
        WebElement btnDialogoElement= driver.findElement(btnDialogo);
        btnDialogoElement.click();
        Thread.sleep(2000);
        driver.switchTo().window(ventana);

        textAreaElement.sendKeys("La teoría del caos es la rama de la matemática, la física y otras ciencias (biología, meteorología, economía, entre otras) que trata ciertos tipos de sistemas complejos y sistemas dinámicos no lineales muy sensibles a las variaciones en las condiciones iniciales.");
        Thread.sleep(2000);

        desplegarListaWE.click();
        Thread.sleep(1000);

        btnFrancesElement.click();
        Thread.sleep(2000);

        desplegarListaWE.click();
        Thread.sleep(1000);

        btnInglesElement.click();
        Thread.sleep(1000);
        desplegarListaWE.click();
        Thread.sleep(1000);

        btnPortuguesWE.click();



        Thread.sleep(3000);



        }

    @AfterEach
    void close(){
        driver.quit();
    }

}

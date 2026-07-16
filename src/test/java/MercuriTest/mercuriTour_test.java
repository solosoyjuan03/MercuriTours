package MercuriTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mercuriTour_test {

    private WebDriver driver;

    By registerLinkLocator = By.linkText("REGISTER");
    By registerPageLocater = By.xpath("//img[@src=\"images/mast_register.gif\"] ");


    @BeforeEach
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @AfterEach
    public  void tearDown() throws Exception {
        driver.quit();

    }

    @Test
    public void registerUser() throws ExecutionControl.InternalException, InterruptedException {
        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);

    }


}

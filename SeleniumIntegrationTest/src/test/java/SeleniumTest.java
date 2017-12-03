import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Sinigaglia Steeve
 * @version 1.0.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class SeleniumTest {

    private static ChromeDriverService service;
    private WebDriver driver;

    @BeforeClass
    public static void createAndStartService() throws IOException {
        String exePath = "C:\\Users\\Steeve\\Work\\EMN\\FIL_2018\\DSL\\chromedriver.exe";

        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(exePath))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @AfterClass
    public static void createAndStopService() {
        service.stop();
    }

    @Before
    public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void test_one_page_contains_link() {
        driver.get("http://www.imt-atlantique.fr/fr");
        WebElement theLink = findVisibleOne(By.xpath("//a[text()='Toutes les actualités']"));
        Assert.assertNotNull(theLink);
    }

    @Test
    public void test_two_click() {
        driver.get("http://www.imt-atlantique.fr/fr");

        WebElement theLink = findVisibleOne(By.xpath("//a[text()='Toutes les actualités']"));
        Assert.assertNotNull(theLink);

        this.scrollTo(theLink.getLocation().y);
        theLink.click();

        WebElement accueil = findVisibleOne(By.xpath("//a[text()='Accueil']"));
        Assert.assertNotNull(accueil);
    }

    @Test
    public void test_three_image_click() {
        driver.get("http://www.imt-atlantique.fr/fr");
        WebElement theLink = findVisibleOne(By.xpath("//a[text()='Toutes les actualités']"));
        scrollTo(theLink);
        theLink.click();

        WebElement image = findVisibleOne(By.xpath("//img[@alt='Accueil']"));
        Assert.assertNotNull(image);

        scrollTo(image);
        image.click();

        theLink = findVisibleOne(By.xpath("//a[text()='Toutes les actualités']"));
        Assert.assertNotNull(theLink);

    }

    @Test
    public void test_four_search_field_and_button() throws InterruptedException {
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");
        WebElement searchField = findVisibleOne(By.name("search_api_fulltext"));
        Assert.assertNotNull(searchField);

        searchField.sendKeys("Donald Trump");

        WebElement button = findVisibleOne(By.xpath("//input[@type='submit'][@value='Appliquer les filtres']"));
        scrollTo(button.getLocation().y);
        button.click();
        WebElement lbl = findVisibleOne(By.xpath("//*[contains(text(),'Aucun résultat')]"));
        Assert.assertNotNull(lbl);
    }

    @Test
    public void test_google_input() {
        driver.get("http://www.google.fr");
        driver.findElement(By.name("q")).sendKeys("Free Selenium Training");
        driver.findElement(By.name("btnK")).click();
    }

    private WebElement findVisibleOne(By by) {
        List<WebElement> elements = driver.findElements(by);
        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                return element;
            }
        }
        return null;
    }


    private void scrollTo(int y) {
        y = y - 100;
        StringBuilder stringBuilder = new StringBuilder("window.scrollTo(0,");
        stringBuilder.append(y)
                .append(")");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(stringBuilder.toString());
    }

    private void scrollTo(WebElement element) {
        this.scrollTo(element.getLocation().y);
    }
}


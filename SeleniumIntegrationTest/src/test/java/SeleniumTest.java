import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

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
        WebElement lbl = findElementContainsText("Aucun résultat");
        Assert.assertNotNull(lbl);
    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
     * uncheck all checkboxes
     * check the checkboxes “Anglais” and “A domicile”
     * click on the button "Appliquer les critères"
     * verify that the page contains the text "Aucune formation trouvée répondant à vos critères"
     */
    @Test
    public void test_five_checkbox() throws InterruptedException {
        driver.get("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");
        //uncheck all checkbox if needed.
        for (WebElement webElement : findCheckboxes()) {
            this.scrollTo(webElement);
            if (webElement.isDisplayed() && webElement.isSelected())
                webElement.click();
        }

        scrollTo(findCheckbox("Anglais")).click();
        scrollTo(findCheckbox("A domicile")).click();
        scrollTo(findButton("Appliquer les critères")).click();

        WebElement element = findElementContainsText("Aucune formation trouvée répondant à vos critères");
        Assert.assertNotNull(element);
    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr/rechercher"
     * insert "2007" in the search field
     * choose the option "Le mois dernier" in the combobox
     * click on the button "Appliquer les filtres"
     * verify that the page contains the text "Aucun résultat ne correspond à votre recherche"
     */
    @Test
    public void test_six_combobox() {
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");
        WebElement searchField = findVisibleOne(By.name("search_api_fulltext"));
        searchField.sendKeys("2007");

        Select select = findCombobox();
        select.selectByVisibleText("Le mois dernier");
        scrollTo(findButton("Appliquer les filtres")).click();

        WebElement element = findElementContainsText("Aucun résultat ne correspond à votre recherche");
        Assert.assertNotNull(element);
    }

    private Select findCombobox() {
        List<WebElement> comboboxes = driver.findElements(By.tagName("select"));
        for (WebElement combobox : comboboxes) {
            if (combobox.isDisplayed() && combobox.isEnabled()) {
                return new Select(combobox);
            }
        }
        throw new RuntimeException("No combobox found");
//        return new Select(driver.findElement(By.tagName("select")));
    }

    private WebElement findButton(String label) {
        return driver.findElement(By.xpath("//input[@type='submit'][@value='" + label + "']"));
    }

    private WebElement findElementContainsText(String text) {
        return driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    private List<WebElement> findCheckboxes() {
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        return elements;
    }

    private WebElement findCheckbox(String lbl) {
        WebElement label = driver.findElement(By.xpath("//label[text()='" + lbl + "']"));
        return label.findElement(By.xpath("preceding-sibling::*[1]"));
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

    private WebElement scrollTo(WebElement element) {
        this.scrollTo(element.getLocation().y);
        return element;
    }
}


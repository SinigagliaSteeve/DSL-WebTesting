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
        WebElement searchField = findSearchField();
        searchField.sendKeys("2007");

        Select select = findCombobox();
        select.selectByVisibleText("Le mois dernier");
        scrollTo(findButton("Appliquer les filtres")).click();

        WebElement element = findElementContainsText("Aucun résultat ne correspond à votre recherche");
        Assert.assertNotNull(element);
    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr"
     * read the text of one title (class="actu_home_ctner_inner_cell1_titre") in the page and the url it points
     * go to the url "http://www.imt-atlantique.fr/fr/rechercher"
     * paste the title in the search field * click on the button "Appliquer les filtres"
     * verify that the page contains a link to the previous url
     */
    @Test
    public void test_seven_parent_copy_paste() {
        driver.get("http://www.imt-atlantique.fr/fr");

//        DIV CLASS=”actu_home_ctner_inner_cell1_titre” {
        WebElement divTitle = driver.findElement(By.className("actu_home_ctner_inner_cell1_titre"));
//            store TITLE in ”title”
        String title = divTitle.getText();
//            A PARENT {
        WebElement aParent = findParent(divTitle);
//                store href in “url”
        String url = aParent.getAttribute("href");
//            }
//        }
//        go "http://www.imt-atlantique.fr/fr/rechercher"
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");
//        SEARCH_FIELD FIRST {
        WebElement searchField = findSearchField();
//            set VAR:”title”
        searchField.sendKeys(title);
//        }
//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }
        WebElement btn = findButton("Appliquer les filtres");
        scrollTo(btn).click();
//        PAGE {
//            verify contains HREF equals VAR:“url”
//        }

        WebElement finalElem = findElementByTagAndAttributes("a", "href", url);
        Assert.assertNotNull(finalElem);
    }

    /**
     * (result=FALSE)
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr/rechercher"
     * insert "2007" in the search field
     * click on the button "Appliquer les filtres"
     * count how many results (class=”views-row”) are shown
     * choose the option "Le mois dernier" in the combobox
     * click on the button "Appliquer les filtres"
     * verify that the number of results is the same of the previous one
     */
    @Test
    public void test_height_count_should_return_false() {
//        open_browser chrome
//        go "http..."
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");
//        SEARCH_FIELD FIRST {
//            set VALUE:"2007"
//        }
        WebElement searchField = findSearchField();
        searchField.sendKeys("2007");

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }
        WebElement btn = findButton("Appliquer les filtres");
        clickButton(btn);

//        PAGE {
//            store (count DIV CLASS:"views-row") in nbResult
//        }

        int nbResult = countBy(By.xpath("//div[@class='views-row']"));

//        COMBO_BOX FIRST {
//            select "Le mois dernier"
//        }

        Select combobox = findCombobox();
        combobox.selectByVisibleText("Le mois dernier");

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }

        WebElement btn2 = findButton("Appliquer les filtres");
        clickButton(btn2);

//        PAGE {
//            store (count DIV CLASS:"views-row") in newNbResult
//            verify VAR:nbResult equals VAR:newNbResult
//        }

        int newNbResult = countBy(By.xpath("//div[@class='views-row']"));
        System.out.println(nbResult + " ?? " + newNbResult);
        Assert.assertNotEquals(nbResult, newNbResult);
    }

    private Select findCombobox() {
        List<WebElement> comboboxes = driver.findElements(By.tagName("select"));
        for (WebElement combobox : comboboxes) {
            if (combobox.isDisplayed() && combobox.isEnabled()) {
                return new Select(combobox);
            }
        }
        throw new RuntimeException("No combobox found");
    }

    private int countBy(By by) {
        return driver.findElements(by).size();
    }

    private WebElement findElementByTagAndAttributes(String tag, String attribute, String value) {
        for (WebElement element : findAllElements(By.tagName(tag))) {
            if (element.getAttribute(attribute).equals(value)) {
                return element;
            }
        }
        return null;
    }

    private void clickButton(WebElement element) {
        scrollTo(element).click();
    }

    private WebElement findSearchField() {
        return findVisibleOne(By.name("search_api_fulltext"));
    }

    private WebElement findParent(WebElement element) {
        return element.findElement(By.xpath(".."));
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

    private List<WebElement> findAllElements(By by) {
        return driver.findElements(by);
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


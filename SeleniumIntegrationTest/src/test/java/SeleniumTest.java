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
import java.util.ArrayList;
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

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr"
     * verify that the page contains a link "Toutes les actualités"
     */
    @Test
    public void test_one_page_contains_link() {
//        go "http://www.imt-atlantique.fr/fr"
        driver.get("http://www.imt-atlantique.fr/fr");
//        PAGE {
//            verify contains (LINK LABEL:"Toutes les actualités")
//        }
//        WebElement elementFinal = findElementByTagAndText("a", "Toutes les actualités");
        WebElement elementFinal = findElementByTagAndText("a", "Toutes les actualités");
        Assert.assertNotNull(elementFinal);
    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr"
     * click on the link "Toutes les actualités"
     * verify that the page contains a link "Accueil"
     */
    @Test
    public void test_two_click() {
//        go "http://www.imt-atlantique.fr/fr"
        driver.get("http://www.imt-atlantique.fr/fr");

//        LINK LABEL:"Toutes les actualités" {
//            click
//        }
        WebElement theLink = findElementByTagAndText("a", "Toutes les actualités");
        clickElem(theLink);
//        PAGE {
//            verify contains LINK LABEL:"Accueil"
//        }

        WebElement elementFinal = findElementByTagAndText("a", "Accueil");
        Assert.assertNotNull(elementFinal);
    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr"
     * click on the link "Toutes les actualités"
     * click on the image with alt property “Accueil”
     * verify that the page contains a link "Toutes les actualités"
     */
    @Test
    public void test_three_image_click() {
//        go "http://www.imt-atlantique.fr/fr"
        driver.get("http://www.imt-atlantique.fr/fr");
//        LINK LABEL:"Toutes les actualités" {
//            click
//        }
        WebElement link = findElementByTagAndText("a", "Toutes les actualités");
        clickElem(link);

//        IMAGE ALT:"Accueil" {
//            click
//        }
        WebElement image = findElementByTagAndAttribute("img", "alt", "Accueil");
        clickElem(image);

//        PAGE {
//            verify contains LINK LABEL:"Toutes les actualités"
//        }

        WebElement elemFinal = findElementByTagAndText("a", "Toutes les actualités");
        Assert.assertNotNull(elemFinal);

    }

    /**
     * open a browser window
     * go to the url "http://www.imt-atlantique.fr/fr/rechercher"
     * insert "Donald Trump" in the search field
     * click on the button "Appliquer les filtres"
     * verify that the page contains the text "Aucun résultat ne correspond à votre recherche"
     */
    @Test
    public void test_four_search_field_and_button() {
//        go "http://www.imt-atlantique.fr/fr/rechercher"
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");

//        SEARCH_FIELD FIRST {
//            set "Donald Trump"
//        }
        WebElement searchField = findSearchField();
        searchField.sendKeys("Donald Trump");

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }

        WebElement btn = findButton("Appliquer les filtres"); //option 1
        clickElem(btn);
//        LINK ALL {
//            verify contains LABEL:"Aucun résultat ne correspond à votre recherche"
//        }

        WebElement lbl = findElementContainsText("Aucun résultat ne correspond à votre recherche");
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
//        go "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation"
        driver.get("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");

//        CHECKBOX ALL {
//            uncheck
//        }
        this.uncheckAllCheckboxes();

//        CHECKBOX LABEL:"Anglais" {
//            check
//        }
        WebElement checkboxAnglais = findCheckbox("Anglais");
        clickElem(checkboxAnglais);

//        CHECKBOX LABEL:"A domicile" {
//            check
//        }
        WebElement checkboxADomicile = findCheckbox("A domicile");
        clickElem(checkboxADomicile);

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }
        WebElement btn = findButton("Appliquer les critères");
        clickElem(btn);

//        PAGE {
//            verify contains TEXT:"Aucune formation trouvée répondant à vos critères"
//        }

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
//        go "http://www.imt-atlantique.fr/fr/rechercher"
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");

//        SEARCH_FIELD FIRST {
//            set "2007"
//        }
        WebElement searchField = findSearchField();
        searchField.sendKeys("2007");

//        COMBO_BOX FIRST {
//            select "Le mois dernier"
//        }
        Select select = findCombobox();
        select.selectByVisibleText("Le mois dernier");

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }
        WebElement btn = findButton("Appliquer les filtres");
        clickElem(btn);
//        PAGE {
//            verify contains TEXT:"Aucun résultat ne correspond à votre recherche"
//        }
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
        WebElement divTitle = findElementByTagAndAttribute("div", "class", "actu_home_ctner_inner_cell1_titre");
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
        clickElem(btn);
//        PAGE {
//            verify contains HREF equals VAR:“url”
//        }

        WebElement finalElem = findElementByTagAndAttribute("a", "href", url);
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
        clickElem(btn);

//        PAGE {
//            store (count DIV CLASS:"views-row") in nbResult
//        }

        List<WebElement> elementsToCountNbResult = findElementsByTagAndAttribute("div", "class", "views-row");
        int nbResult = elementsToCountNbResult.size();

//        COMBO_BOX FIRST {
//            select "Le mois dernier"
//        }

        Select combobox = findCombobox();
        combobox.selectByVisibleText("Le mois dernier");

//        BUTTON LABEL:"Appliquer les filtres" {
//            click
//        }

        WebElement btn2 = findButton("Appliquer les filtres");
        clickElem(btn2);

//        PAGE {
//            store (count DIV CLASS:"views-row") in newNbResult
//            verify VAR:nbResult equals VAR:newNbResult
//        }
        List<WebElement> elementsToCountNewNbResult = findElementsByTagAndAttribute("div", "class", "views-row");
        int newNbResult = elementsToCountNewNbResult.size();

        Assert.assertNotEquals(nbResult, newNbResult);
    }

//    /**
//     * open a browser window
//     * go to the url "http://www.imt-atlantique.fr/fr"
//     * go to the page "COMMUNIQUÉS DE PRESSE" by clicking its link
//     * verify that the page contains an image "Imprimer"
//     * click on the image
//     * repeat all the procedure for the pages DOSSIERS DE PRESSE, VISUELS POUR LA PRESSE, LA
//     * PRESSE EN PARLE, TRIBUNES DE PRESSE, LES PALMARÈS
//     */
//    @Test
//    public void test_nine_procedures() {
//
////}
////
////        PROC:test_link("COMMUNIQUES DE PRESSE")
//        test_link("COMMUNIQUÉS DE PRESSE");
//
////        PROC:test_link("VISUELS POUR LA PRESSE")
//        test_link("VISUELS POUR LA PRESSE");
//
////        PROC:test_link("LA PRESSE EN PARLE")
//        test_link("LA PRESSE EN PARLE");
//
////        PROC:test_link("TRIBUNES DE PRESSE")
//        test_link("TRIBUNES DE PRESSE");
//
////        PROC:test_link("LES PALMARÈS")
//        test_link("LES PALMARÈS");
//
//    }
//
//    private void test_link(String nom) {
//        //        PROCEDURE test_link(nom){
////                go "http"
//        driver.get("http://www.imt-atlantique.fr/fr");
////                LINK LABEL:nom{
////            click
////        }
//        WebElement webElement = findVisibleOne(By.xpath("//a[text()='" + nom + "']"));
//
//        clickElem(webElement);
//
//
////        PAGE {
////            verify contains LINK TITLE:"Imprimer"
////        }
////        LINK TITLE:"Imprimer" {
////            click
////        }
//        driver.get("http://www.imt-atlantique.fr/fr");
//
//    }

    /**
     * Uncheck all checkboxes in the page.
     */
    private void uncheckAllCheckboxes() {
        for (WebElement webElement : findCheckboxes()) {
            this.scrollTo(webElement);
            if (webElement.isDisplayed() && webElement.isSelected())
                webElement.click();
        }
    }


    /**
     * Find the first combobox in the page.
     *
     * @return Select object (combobox).
     */
    private Select findCombobox() {
        List<WebElement> comboboxes = driver.findElements(By.tagName("select"));
        for (WebElement combobox : comboboxes) {
            if (combobox.isDisplayed() && combobox.isEnabled()) {
                return new Select(combobox);
            }
        }
        throw new RuntimeException("No combobox found");
    }

//    private int countBy(By by) {
//        return driver.findElements(by).size();
//    }

    private WebElement findElementByTagAndAttribute(String tag, String attribute, String value) {
        for (WebElement element : findAllElements(By.tagName(tag))) {
            if (element.getAttribute(attribute).equals(value)) {
                return element;
            }
        }
        return null;
    }

    private List<WebElement> findElementsByTagAndAttribute(String tag, String attribute, String value) {
        if (attribute == null || attribute.equals("")) {
            throw new RuntimeException("attribute can't be null");
        }
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : findAllElements(By.tagName(tag))) {
            if (element.getAttribute(attribute).equals(value)) {
                elements.add(element);
            }
        }
        return elements;
    }

    private WebElement findElementByTagAndText(String tag, String value) {
        final String xpath = "//" + tag + "[text()='" + value + "']";
        for (WebElement element : driver.findElements(By.xpath(xpath))) {
            if (element.isEnabled() && element.isDisplayed()) {
                return element;
            }
        }
        return null;
    }

    private List<WebElement> findElementsByTagAndText(String tag, String value) {
        final String xpath = "//" + tag + "[text()='" + value + "']";
        List<WebElement> elements = new ArrayList<>();
        for (WebElement element : driver.findElements(By.xpath(xpath))) {
            if (element.isEnabled() && element.isDisplayed()) {
                elements.add(element);
            }
        }
        return elements;
    }

    private void clickElem(WebElement element) {
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


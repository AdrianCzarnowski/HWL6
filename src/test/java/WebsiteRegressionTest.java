import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WebsiteRegressionTest extends SetUp {

    @Tag("Regression")
    @Tag("Onet")
    @DisplayName("Onet")
    @Order(1)
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    public void regressionTestOnet(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);

    }

    @Tag("Regression")
    @Tag("Kotuszkowo")
    @DisplayName("Kotuszkowo")
    @Order(2)
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    public void regressionTestKotuszkowo(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);
    }

    @Tag("Regression")
    @Tag("Filmweb")
    @DisplayName("Filmweb")
    @Order(3)
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    public void regressionTestFilmweb(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);
    }

    @Tag("Regression")
    @Tag("Selenium")
    @DisplayName("Selenium")
    @Order(4)
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    public void regressionTestSelenium(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);
    }

    @Tag("Regression")
    @Tag("Sii")
    @DisplayName("Sii")
    @Order(5)
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "https://siiportal.sii.pl/, Logowanie na koncie",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
    })
    public void regressionTestSii(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);
    }
}





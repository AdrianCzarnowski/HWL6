import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class WebsiteRegressionTest extends SetUp {

    @Tag("Regression")
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    public void TestRegression(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);
    }
}





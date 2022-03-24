import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WebsiteRegressionTest extends BasePage {

    private static Logger logger = LoggerFactory.getLogger("WebsiteRegressionTest.class");


    @Tag("Regression")
    @ParameterizedTest(name = "{0}")
    @CsvSource({
//            "https://www.onet.pl/, Onet – Jesteś na bieżąco",
            "http://kotuszkowo.pl/, Kotuszkowo- blog o kotach",
//            "https://www.filmweb.pl/, Filmweb - filmy takie jak Ty!",
//            "https://www.selenium.dev/documentation/en/webdriver/, WebDriver | Selenium",
//            "https://siiportal.sii.pl/, Logowanie na koncie",
    })
    void TestRegression(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);

        logger.info("<<<<<App url : " + websiteAddress);
        logger.info("<<<<<Expected tittle  : " + expectedTitle);
    }
}





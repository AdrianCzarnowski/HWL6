import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WebsiteRegressionTest extends BasePage {

    private static Logger logger = LoggerFactory.getLogger("WebsiteRegressionTest.class");


    @Tag("Regression")
    @ParameterizedTest(name = "{0}")
    @CsvFileSource(resources = "/convertcsv.csv")
    @DisplayName("Website title regression test")

    void TestRegression(String websiteAddress, String expectedTitle) {
        Test(websiteAddress, expectedTitle);

        logger.info("<<<<<App url : " + websiteAddress);
        logger.info("<<<<<Expected tittle  : " + expectedTitle);
    }
}





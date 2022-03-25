import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BasePage {
    private static Logger logger = LoggerFactory.getLogger("BasePage.class");

    public WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        logger.info("<<<<<Driver initiated properly");
    }

    @BeforeEach
    void beforeEach() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearsDown() {
        driver.manage().deleteAllCookies();
        logger.info("<<<<<Driver deleted cookies properly");
        driver.quit();
        logger.info("<<<<<Driver closed properly");
    }

    public void Test(String websiteAddress, String expectedTitle) {
        driver.get(websiteAddress);
        logger.info("<<<<<Driver get correct website address");
        String actualTitle = driver.getTitle();
        logger.info("<<<<<Driver get correct website title");
        assertThat("Title is not correct", actualTitle, equalTo(expectedTitle));
        logger.info("<<<<<expected title is equal than actual title");
    }
}



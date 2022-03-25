package base;

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
    public static final String PURPLE = "\u001B[35m";
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String BLACK = "\u001B[30m";

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        logger.info(BLACK + WHITE_BACKGROUND + "♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛" + COLOR_RESET);
        logger.info("<<<<<Driver initiated properly");
        logger.info(BLACK + WHITE_BACKGROUND + "♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛" + COLOR_RESET);
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
        logger.info(BLACK + WHITE_BACKGROUND + "♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛♛" + COLOR_RESET);
    }

    public void Test(String websiteAddress, String expectedTitle) {
        driver.get(websiteAddress);
        logger.info("<<<<<Driver get correct website address");
        String actualTitle = driver.getTitle();
        logger.info(PURPLE + "<<<<<Driver get actual website title : " + COLOR_RESET + actualTitle);
        assertThat("Title is not correct", actualTitle, equalTo(expectedTitle));
        logger.info("<<<<<expected title is equal than actual title");
    }
}



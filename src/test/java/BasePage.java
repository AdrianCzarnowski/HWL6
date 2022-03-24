import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BasePage {

    public WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void beforeEach() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearsDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void Test(String websiteAddress, String expectedTitle) {
        driver.get(websiteAddress);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        assertThat("Title is not correct", actualTitle, equalTo(expectedTitle));
//        driver.switchTo().newWindow(WindowType.TAB);
    }
}



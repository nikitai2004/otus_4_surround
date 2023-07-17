import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

    private Logger logger = LogManager.getLogger(Test1.class);
    private WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("  === BeforeAll ===");
    }

    @BeforeEach
    public void before() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();


//        logger.error("error");
//        logger.warn("warn");
//        logger.info("info");
//        logger.debug("debug");
//        logger.trace("trace");
//
//        System.out.println("  === Before ===");
    }

    @Test
    public void test1() {
        driver.get("https://otus.ru");

        Assertions.assertEquals("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям", driver.getTitle());
    }

//    @Test
//    public void test2() {
//        Assertions.assertEquals(2, 2);
//    }
//
//    @Test
//    public void test3() {
//        Assertions.assertEquals(2, 2);
//    }
//
//    @Test
//    public void test4() {
//        Assertions.assertEquals(2, 2);
//    }


    @AfterEach
    public void closeAll() {
        System.out.println("  === AfterEach ===");
    }

    @AfterAll
    public static void endAll() {
        System.out.println("  === AfterAll ===");
    }


}
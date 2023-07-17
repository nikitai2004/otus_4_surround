import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import static com.mysql.cj.conf.PropertyKey.logger;

public class Test1 {

    private Logger logger = LogManager.getLogger(Test1.class);

    @BeforeAll
    public static void beforeAll() {
        System.out.println("  === BeforeAll ===");
    }

    @BeforeEach
    public void before() {
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        System.out.println("  === Before ===");
    }

    @Test
    public void test1() {
        Assertions.assertEquals(2, 31);
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2, 2);
    }

    @Test
    public void test3() {
        Assertions.assertEquals(2, 2);
    }

    @Test
    public void test4() {
        Assertions.assertEquals(2, 2);
    }


    @AfterEach
    public void closeAll() {
        System.out.println("  === AfterEach ===");
    }

    @AfterAll
    public static void endAll() {
        System.out.println("  === AfterAll ===");
    }


}
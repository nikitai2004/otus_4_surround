import org.junit.jupiter.api.*;

public class Test1{
    @BeforeAll
    public static void beforeAll(){
        System.out.println("  === BeforeAll ===");
    }

    @BeforeEach
    public void before(){
        System.out.println("  === Before ===");
    }

    @Test
    public void test1(){
        Assertions.assertEquals(2,31);
    }

    @Test
    public void test2(){
        Assertions.assertEquals(2,2);
    }

    @Test
    public void test3(){
        Assertions.assertEquals(2,2);
    }

    @Test
    public void test4(){
        Assertions.assertEquals(2,2);
    }


    @AfterEach
    public void closeAll (){
        System.out.println("  === AfterEach ===");
    }

    @AfterAll
    public static void endAll (){
        System.out.println("  === AfterAll ===");
    }


}
package springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("BeforeAll - I'm only called once!!!");
    }

    @BeforeEach
    void setup() {
        System.out.println("In BeforeEach ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorldV1() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorldV2() {
        System.out.println(greeting.helloWorld("Oscar"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("AfterAll - I'm only called once!!!");
    }

}
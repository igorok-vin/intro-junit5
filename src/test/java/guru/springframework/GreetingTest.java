package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before - I'm only called Once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Runs before each method....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Igor"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each Method...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After Everything - I'm only called Once!!!");
    }
}
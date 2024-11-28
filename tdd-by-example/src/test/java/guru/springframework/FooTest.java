package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {

    @Test
    void getBarTest() {
        Foo foo = new Foo();
        String result = foo.getBar();
        assertEquals("Foobar", result);
    }

}

package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void dollarMultiplicationTest() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void dollarEqualityTest() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void francMultiplicationTest() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void francEqualityTest() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }

}

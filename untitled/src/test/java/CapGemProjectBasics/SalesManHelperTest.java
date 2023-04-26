package CapGemProjectBasics;

import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

class SalesManHelperTest {
    // najpierw napisz testy "red", napisz implementacje "green", zrób "refactor" posprzątaj kod
    @Test
    public void howMuchWillIBuy() {
        int result = SalesManHelper.howMuchWillIBuy(100, 250);
        int expected = 2;
        assertEquals(expected, result);

    }
    @Test
    public void howMuchWillIBuy() {
        int result = SalesManHelper.howMuchWillIBuy(100, 90);
        int expected = 0;
        assertEquals(expected, result);
    }
}

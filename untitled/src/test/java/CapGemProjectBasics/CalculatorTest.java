package CapGemProjectBasics;

import CapGemProjectBasics.Calculator;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class CalculatorTest {

    public class CalculatorTest{

        @Test
        public void test_add(){
            int result = Calculator.add(5,1);
            Assertions.assertEquals(6,result);
        }
    }

}

package dz3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTask1AndTask2 {

    @Test
    public void testOddNumber(){
        assertFalse(Task1AndTask2.evenOddNumber(5));
    }
    @Test
    public void testEvenNumber(){
        assertTrue(Task1AndTask2.evenOddNumber(6));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100, -20, 101, 10000})
    public void testNumberInIntervalFalse(int num){
        assertFalse(Task1AndTask2.numberInInterval(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 99, 35, 60, 49})
    public void testNumberInIntervalTrue(int num){
        assertTrue(Task1AndTask2.numberInInterval(num));
    }
}

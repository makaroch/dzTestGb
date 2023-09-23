package dz1.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class Calculator {
    public double calculateDiscount(double price, int discount){
        if (price < 0 || discount < 0){
            throw new  ArithmeticException("Цена или скидка не могут быть отрицательными");
        }
        return price - (price / 100 * discount);
    }
    @Test
    public void test(){
        testDiscountPositive();
        testDiscountNegative();
        testDiscountZeros();

    }
    @Test
    public void testDiscountPositive(){
        assertThat(calculateDiscount(100, 5)).isEqualTo(95.0);
    }
    @Test
    public void testDiscountNegative(){
        assertThatThrownBy(() -> calculateDiscount(-10, 8)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculateDiscount(5, -5)).isInstanceOf(ArithmeticException.class);
    }
    @Test
    public void testDiscountZeros(){
        assertThat(calculateDiscount(0, 5)).isEqualTo(0);
        assertThat(calculateDiscount(5, 0)).isEqualTo(5);
    }

}

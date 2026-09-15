package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiscountCalculatorTest {

    @Test
    void testCalculateDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        float result = calculator.calculateDiscount(80.0f, 100.0f);

        assertThat(result).isEqualTo(80.0f);
    }
}
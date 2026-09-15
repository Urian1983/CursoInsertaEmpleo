package model;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class DiscountCalculatorTest {

    private final DiscountCalculator calculator = new DiscountCalculator();

    @Test
    @DisplayName("Debe calcular el porcentaje de descuento correctamente")
    void testCalculateDiscount() {
        float result = calculator.calculateDiscount(80.0f, 100.0f);

        assertThat(result)
                .isCloseTo(20.0f, within(0.001f));
    }
}
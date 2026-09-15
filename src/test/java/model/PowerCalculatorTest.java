package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerCalculatorTest {

    @Test
    void testPowerCal() {
        PowerCalculator calculator = new PowerCalculator();
        float result = calculator.powerCal(10f, 5f);

        assertThat(result).isEqualTo(50f);
    }
}
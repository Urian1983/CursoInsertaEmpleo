package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerCalculatorTest {

    @Test
    void testPowerCal() {
        PowerCalculator calculator = new PowerCalculator();
        int result = calculator.powerCal(10, 5);

        assertThat(result).isEqualTo(50);
    }
}
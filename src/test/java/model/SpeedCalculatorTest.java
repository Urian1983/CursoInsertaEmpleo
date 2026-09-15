package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpeedCalculatorTest {

    @Test
    void testCalculateSpeed() {
        SpeedCalculator calculator = new SpeedCalculator();
        float speed = calculator.calculateSpeed(2f, 100f);

        assertThat(speed).isEqualTo(50.0f);
    }
}
package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceCalculatorTest {

    @Test
    void testCalculateSpeed() {
        DistanceCalculator calculator = new DistanceCalculator();
        float speed = calculator.calculateSpeed(2, 100);

        assertThat(speed).isEqualTo(50.0f);
    }
}
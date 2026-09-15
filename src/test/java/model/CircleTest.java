package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CircleTest {

    @Test
    void testArea() {
        Circle circle = new Circle();
        Double result = circle.area(2.0f);

        assertThat(result).isNotNull();
    }

    @Test
    void testAreaNull() {
        Circle circle = new Circle();

        assertThatThrownBy(() -> circle.area(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testPerimeter() {
        Circle circle = new Circle();
        Double result = circle.perimeter(2.0f);

        assertThat(result).isNotNull();
    }
}
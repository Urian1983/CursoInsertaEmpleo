package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {

    @Test
    void testArea() {
        Circle circle = new Circle();
        Double result = circle.area(2);

        assertThat(result).isEqualTo(12.566370614359172);
    }

    @Test
    void testPerimeter() {
        Circle circle = new Circle();
        Double result = circle.perimeter(2);

        assertThat(result).isEqualTo(12.566370614359172);


    }
}
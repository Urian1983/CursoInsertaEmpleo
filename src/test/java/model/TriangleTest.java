package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void testArea() {
        Triangle triangle = new Triangle();
        float result = triangle.area(5, 10);

        assertThat(result).isEqualTo(25.0f);
    }
}
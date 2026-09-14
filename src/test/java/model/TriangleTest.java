package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateArea(){
        Triangle testTriangle = new Triangle();

        assertEquals(12.5,testTriangle.area(5, 5));
    }

}
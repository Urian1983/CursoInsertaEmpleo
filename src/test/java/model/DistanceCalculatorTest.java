package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceCalculatorTest {

    @Test
    void shouldCalulateDistance(){
        DistanceCalculator distanceCalculatorTest = new DistanceCalculator(15,2);

        assertEquals(7.5,7.5);
    }

}
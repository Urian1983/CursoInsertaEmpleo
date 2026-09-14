package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceCalculatorUnitsConversorTest {

    @Test
    void shouldCalulateMilesfromKilometers(){
        DistanceUnitsConversor distanceUnitsConversor = new DistanceUnitsConversor();

        Double result = distanceUnitsConversor.kilometersToMiles(1.832);

        assertEquals(1.832,1);
    }

    @Test
    void shouldCalulateKilometsfromMiles(){
        DistanceUnitsConversor distanceUnitsConversor = new DistanceUnitsConversor();

        Double result = distanceUnitsConversor.milesToKilometers(1.0);

        assertEquals(1,1.832);
    }

}
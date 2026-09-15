package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceUnitsConversorTest {

    @Test
    void testMilesToKilometers() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        Double result = conversor.milesToKilometers(10.0);

        assertThat(result).isEqualTo(18.52);
    }

    @Test
    void testKilometersToMiles() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        Double result = conversor.kilometersToMiles(18.52);

        assertThat(result).isEqualTo(10.0);
    }
}
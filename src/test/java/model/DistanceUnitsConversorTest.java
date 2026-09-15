package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceUnitsConversorTest {

    @Test
    void testMilesToKilometers() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        float result = conversor.milesToKilometers(10.0f);

        assertThat(result).isEqualTo(18.52f);
    }

    @Test
    void testKilometersToMiles() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        float result = conversor.kilometersToMiles(18.52f);

        assertThat(result).isEqualTo(10.0f);
    }
}
package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceUnitsConversorTest {

    @Test
    void testMilesToMeters() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        float result = conversor.milesToMeters(10.0f);

        assertThat(result).isEqualTo(18520f);
    }

    @Test
    void testMetersToMiles() {
        DistanceUnitsConversor conversor = new DistanceUnitsConversor();
        float result = conversor.metersToMiles(18520f);

        assertThat(result).isEqualTo(10.0f);
    }
}
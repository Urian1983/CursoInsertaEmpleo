package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EuroConversorTest {

    @Test
    void testEuroToPeseta() {
        EuroConversor conversor = new EuroConversor();
        float pesetas = conversor.euroToPeseta(1);

        assertThat(pesetas).isEqualTo(166.387f);
    }

    @Test
    void testPesetaToEuro() {
        EuroConversor conversor = new EuroConversor();
        float euros = conversor.pesetaToEuro(166.387f);

        assertThat(euros).isEqualTo(1.0f);
    }
}
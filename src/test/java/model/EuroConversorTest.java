package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EuroConversorTest {

    @Test
    void testEuroToPeseta() {
        EuroConversor conversor = new EuroConversor();
        double pesetas = conversor.euroToPeseta(1);

        assertThat(pesetas).isEqualTo(166.387);
    }

    @Test
    void testPesetaToEuro() {
        EuroConversor conversor = new EuroConversor();
        double euros = conversor.pesetaToEuro(166.387);

        assertThat(euros).isEqualTo(1.0);
    }
}
package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeConversorTest {

    @Test
    void testTimeConversor() {
        TimeConversor conversor = new TimeConversor();
        conversor.timeConversor(3665);

        assertThat(conversor.toString()).isEqualTo("01:01:05");
    }
}
package utils;

import org.junit.jupiter.api.Test;
import java.util.Locale;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReadFloatTest {

    @Test
    void testFloatValido() {
        Scanner scanner = new Scanner("42.5").useLocale(Locale.US);
        ReadFloat readFloat = new ReadFloat(scanner);

        assertEquals(42.5f, readFloat.getFloat("Mensaje"));
    }

    @Test
    void testTextoInvalido() {
        Scanner scanner = new Scanner("texto");
        ReadFloat readFloat = new ReadFloat(scanner);

        assertNull(readFloat.getFloat("Mensaje"));
    }
}
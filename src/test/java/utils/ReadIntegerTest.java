package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReadIntegerTest {

    @Test
    void testNumeroValido() {
        Scanner scanner = new Scanner("42");
        ReadInteger readInteger = new ReadInteger(scanner);

        assertEquals(42, readInteger.getInteger("Mensaje"));
    }

    @Test
    void testTextoInvalido() {
        Scanner scanner = new Scanner("texto");
        ReadInteger readInteger = new ReadInteger(scanner);

        assertNull(readInteger.getInteger("Mensaje"));
    }
}
package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInteger {
    private static final Logger log = LoggerFactory.getLogger(ReadInteger.class);
    private final Scanner sc;

    public ReadInteger(Scanner sc) {
        this.sc = sc;
    }

    public Integer getInteger(String message) {
        log.debug(message);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            log.error("El dato introducido no es valido, se esperaba un integer");
            sc.nextLine();
            return null;
        }
    }
}

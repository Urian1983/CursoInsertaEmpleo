package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFloat {

    private static final Logger log = LoggerFactory.getLogger(ReadFloat.class);
    private final Scanner sc;
    public ReadFloat(Scanner sc){
        this.sc = sc;
    }
    public Float getFloat(String message){
        log.debug(message);
        try{
            return sc.nextFloat();
        }
        catch(InputMismatchException e){
            log.error("El dato introducido no es valido, se esperaba un float");
            sc.nextLine();
            return null;
        }
    }
}

package cli;

import model.TimeConversor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class TimeConversorCLI {
    private final Scanner sc;
    private final TimeConversor timeConversor;
    private static final Logger log = LoggerFactory.getLogger(TimeConversorCLI.class);

    private TimeConversorCLI(Scanner sc, TimeConversor timeConversor) {
        this.sc = sc;
        this.timeConversor = timeConversor;
    }

    public TimeConversorCLI(Scanner sc){
        this(sc,new TimeConversor());
    }

    public void conversor(){
        log.debug("Escribe los segundos que quieres convertir a horas y minutos");
        int secondsToConvert = sc.nextInt();
        timeConversor.timeConversor(secondsToConvert);
        log.debug("El tiempo total convertido es: {}",timeConversor);
    }

}

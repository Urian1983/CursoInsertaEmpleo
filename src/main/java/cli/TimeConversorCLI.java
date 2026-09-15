package cli;

import model.TimeConversor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;
import utils.ReadInteger;

import java.util.Scanner;

public class TimeConversorCLI {
    private final TimeConversor timeConversor;
    private final ReadInteger readInteger;
    private static final Logger log = LoggerFactory.getLogger(TimeConversorCLI.class);

    private TimeConversorCLI(TimeConversor timeConversor, ReadInteger readInteger) {
        this.timeConversor = timeConversor;
        this.readInteger = readInteger;
    }

    public TimeConversorCLI(Scanner sc){
        this(new TimeConversor(),new ReadInteger(sc));
    }

    public void conversor(){
        Integer secondsToConvert = readInteger.getInteger("Escribe los segundos que quieres convertir a horas y minutos");
        if(secondsToConvert==null){
            return;
        }
        timeConversor.timeConversor(secondsToConvert);
        log.debug("El tiempo total convertido es: {}",timeConversor);
    }

}

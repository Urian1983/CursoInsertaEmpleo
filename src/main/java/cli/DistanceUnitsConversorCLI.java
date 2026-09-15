package cli;

import model.DistanceUnitsConversor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

import java.util.Scanner;

public class DistanceUnitsConversorCLI {
    private final DistanceUnitsConversor distanceUnitsConversor;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(DistanceUnitsConversorCLI.class);

    private DistanceUnitsConversorCLI(DistanceUnitsConversor distanceUnitsConversor,  ReadFloat readFloat) {
        this.distanceUnitsConversor = distanceUnitsConversor;
        this.readFloat = readFloat;
    }

    public DistanceUnitsConversorCLI(Scanner sc) {
        this(new DistanceUnitsConversor(),new ReadFloat(sc));
    }

    public void milesToMeters(){
        Float miles = readFloat.getFloat("Introduce la cantidad de millas a convertir");
        if(miles==null){
            return;
        }
        if(miles<0){
            log.error("El número de millas no puede ser negativo");
        }

        Float meters = distanceUnitsConversor.milesToMeters(miles);
        log.debug("La cantidad de kilómetros para {} son {} kilómetros", miles, meters);
    }

    public void meterstoMiles(){
        Float meters = readFloat.getFloat("Introduce la cantidad de metros a convertir");
        if(meters==null){
            return;
        }
        if(meters<0){
            log.error("El número de metros no puede ser negativo");
        }

        Float miles = distanceUnitsConversor.milesToMeters(meters);
        log.debug("La cantidad de metros para {} son {} millas", meters, miles);

    }
}

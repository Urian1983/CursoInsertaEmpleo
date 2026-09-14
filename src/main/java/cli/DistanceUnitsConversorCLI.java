package cli;

import model.DistanceUnitsConversor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DistanceUnitsConversorCLI {
    private final DistanceUnitsConversor distanceUnitsConversor;
    private final Scanner sc;
    private static final Logger log = LoggerFactory.getLogger(DistanceUnitsConversorCLI.class);

    public DistanceUnitsConversorCLI(Scanner sc, DistanceUnitsConversor distanceUnitsConversor) {
        this.distanceUnitsConversor = distanceUnitsConversor;
        this.sc = sc;
    }

    public DistanceUnitsConversorCLI(Scanner sc) {
        this(sc,new DistanceUnitsConversor());
    }

    public void milesToKilometers(){
        log.debug("Entra el número de millas");
        Double miles = sc.nextDouble();
        Double kilometers = distanceUnitsConversor.milesToKilometers(miles);
        log.debug("La cantidad de kilómetros para {} son {} kilómetros", miles, kilometers);
    }

    public void kilometerstoMiles(){
        log.debug("Entra el número de kilometros");
        Double kilometers = sc.nextDouble();
        Double miles = distanceUnitsConversor.kilometersToMiles(kilometers);
        log.debug("La cantidad de kilometros para {} son {} millas", kilometers, miles);
    }
}

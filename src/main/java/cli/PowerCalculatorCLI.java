package cli;

import model.PowerCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class PowerCalculatorCLI {
    private final Scanner sc;
    private final PowerCalculator powerCalculator;
    private static final Logger log = LoggerFactory.getLogger(PowerCalculatorCLI.class);

    public PowerCalculatorCLI(Scanner sc, PowerCalculator powerCalculator) {
        this.sc = sc;
        this.powerCalculator = powerCalculator;
    }

    public PowerCalculatorCLI(Scanner sc){
        this(sc, new PowerCalculator());
    }

    public void powerCal(){
        log.debug("Entra el voltaje");
        int voltaje = sc.nextInt();
        log.debug("Entra la intensidad");
        int intensidad = sc.nextInt();

        int power= powerCalculator.powerCal(voltaje,intensidad);

        log.debug("La potencia es {}",power);
    }
}

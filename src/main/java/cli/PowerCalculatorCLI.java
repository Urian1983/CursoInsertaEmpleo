package cli;

import model.PowerCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

import java.util.Scanner;

public class PowerCalculatorCLI {
    private final PowerCalculator powerCalculator;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(PowerCalculatorCLI.class);

    public PowerCalculatorCLI(PowerCalculator powerCalculator,  ReadFloat readFloat) {
        this.powerCalculator = powerCalculator;
        this.readFloat = readFloat;
    }

    public PowerCalculatorCLI(Scanner sc){
        this(new PowerCalculator(), new ReadFloat(sc));
    }

    public void powerCal(){
        Float voltage = readFloat.getFloat("Introduce el voltaje");
        if(voltage == null){
            return;
        }

        Float capacity = readFloat.getFloat("Introduce la capacitacion");
        if(capacity == null){
            return;
        }

        float power= powerCalculator.powerCal(voltage,capacity);

        log.debug("La potencia es {}",power +" vatios");
    }
}

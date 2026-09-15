package cli;

import model.SpeedCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;
import java.util.Scanner;

public class SpeedCalculatorCLI {

    private final SpeedCalculator speedCalculator;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(SpeedCalculatorCLI.class);

    private SpeedCalculatorCLI(SpeedCalculator speedCalculator, ReadFloat readFloat) {
        this.speedCalculator = speedCalculator;
        this.readFloat = readFloat;
    }

    public SpeedCalculatorCLI(Scanner sc) {
        this(new SpeedCalculator(), new ReadFloat(sc));
    }

    public void calculateSpeed(){

        Float distance=readFloat.getFloat("Entra la distancia recorrida");
        if(distance==null){
            return;
        }
        Float time=readFloat.getFloat("Entra el tiempo trancurrido");
        if(time==null){
            return;
        }
        float speed = speedCalculator.calculateSpeed(time,distance);
        log.debug("La velocidad es {}",speed);
    }
}

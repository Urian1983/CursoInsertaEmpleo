package cli;

import model.DistanceCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DistanceCLI {

    private final Scanner sc;
    private final DistanceCalculator distanceCalculator;
    private static final Logger log = LoggerFactory.getLogger(DistanceCLI.class);

    public DistanceCLI(Scanner sc, DistanceCalculator distanceCalculator1) {
        this.sc = sc;
        this.distanceCalculator = distanceCalculator1;
    }

    public DistanceCLI(Scanner sc) {
        this(sc,new DistanceCalculator());
    }

    public void calculateSpeed(){
        System.out.println("Entra la distancia recorrida");
        int distance = sc.nextInt();
        System.out.println("Entra el tiempo que ha tardado");
        int hours = sc.nextInt();

        float speed = distanceCalculator.calculateSpeed(hours,distance);
        System.out.println("La velocidad es " +speed);

    }
}

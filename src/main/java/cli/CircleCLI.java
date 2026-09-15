package cli;

import model.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CircleCLI {

    private final Scanner sc;
    private final Circle circle;
    private static final Logger log = LoggerFactory.getLogger(CircleCLI.class);

    public CircleCLI(Scanner sc, Circle circle) {
        this.sc = sc;
        this.circle = circle;
    }

    public CircleCLI(Scanner sc) {
        this(sc, new Circle());
    }

    public void area (){
        log.debug("entra el radio del círculo");
        int radius = sc.nextInt();
        double area = circle.area(radius);
        log.debug("El área del círculo es {}",area);
    }

    public void perimeter (){
        Circle circle = new Circle();
        log.debug("entra el radio del círculo");
        int radius = sc.nextInt();
        Double area = circle.perimeter(radius);
        log.debug("El perimetro del círculo es {}",area);
    }
}

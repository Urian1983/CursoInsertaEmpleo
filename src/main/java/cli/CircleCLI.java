package cli;

import model.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

import java.util.Scanner;

public class CircleCLI {

    private final Circle circle;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(CircleCLI.class);

    private CircleCLI(Circle circle, ReadFloat readFloat) {
        this.circle = circle;
        this.readFloat = readFloat;
    }

    public CircleCLI(Scanner sc) {
        this(new Circle(), new ReadFloat(sc));
    }

    public void area() {
        Float radius = readFloat.getFloat("entra el radio del círculo");
        if (radius == null) {
            return;
        }
        Double area = circle.area(radius);
        log.debug("El área del círculo es {}", area);
    }

    public void perimeter() {
        Float radius = readFloat.getFloat("entra el radio del círculo");
        if (radius == null) {
            return;
        }
        Double perimeter = circle.perimeter(radius);
        log.debug("El perimetro del círculo es {}", perimeter);
    }
}




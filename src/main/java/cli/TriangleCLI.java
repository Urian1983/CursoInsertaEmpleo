package cli;

import model.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class TriangleCLI {

    private final Scanner sc;
    private final Triangle triangle;
    private static final Logger log = LoggerFactory.getLogger(TriangleCLI.class);

    public TriangleCLI(Scanner sc, Triangle triangle) {
        this.sc = sc;
        this.triangle = triangle;
    }

    public TriangleCLI(Scanner sc) {
        this(sc, new Triangle());
    }

    public void area(){
        log.debug("Entra la base del triángulo");
        int base = sc.nextInt();
        log.debug("Entra la altura del triangulo");
        int altura = sc.nextInt();

        float area = triangle.area(altura,base);
        log.debug("El area del triangulo es {}",area);
    }
}

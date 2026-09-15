package cli;

import model.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

import java.util.Scanner;

public class TriangleCLI {

    private final ReadFloat readFloat;
    private final Triangle triangle;
    private static final Logger log = LoggerFactory.getLogger(TriangleCLI.class);

    private TriangleCLI(Triangle triangle, ReadFloat readFloat) {
        this.triangle = triangle;
        this.readFloat = readFloat;
    }

    public TriangleCLI(Scanner sc) {
        this(new Triangle(), new ReadFloat(sc));
    }

    public void area(){

        Float base = readFloat.getFloat("Introduce la base del triángulo");
        if(base==null){
            return;
        }
        if (base<0){
            log.error("la base no puede ser negativa");
            return;
        }

        Float height = readFloat.getFloat("Introduce la altura del triángulo");
        if(height==null){
            return;
        }
        if (height<0){
            log.error("la altura no puede ser negativa");
            return;
        }

        float area = triangle.area(height,base);
        log.debug("El area del triangulo es {}",area);
    }
}

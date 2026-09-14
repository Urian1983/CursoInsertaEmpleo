package cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    boolean menuTrigger = true;
    Scanner sc = new Scanner(System.in);
    private static final Logger log = LoggerFactory.getLogger(Menu.class);

    CircleCLI circleCLI = new CircleCLI(sc);
    DistanceUnitsConversorCLI distanceUnitsConversor = new DistanceUnitsConversorCLI(sc);
    DiscountCalculatorCLI discountCalculator = new DiscountCalculatorCLI(sc);
    DistanceCLI distance = new DistanceCLI(sc);
    EuroConversorCLI euroConversor = new EuroConversorCLI(sc);
    PowerCalculatorCLI powerCalculator = new PowerCalculatorCLI(sc);
    TriangleCLI triangle = new TriangleCLI(sc);

    public void start() {
        while (menuTrigger) {
            log.debug(printMenu());
            optionMenu();
        }
    }

    private String printMenu() {

        return """
                1. Convierte pesetas a euros.
                2. Convierte euros a pesetas.
                3. Calcular la velocidad dados la distancia y el tiempo.
                4.Calcular el área del triangulo.
                5. Convertir de kilometros a millas.
                6. Convertir de millas a kilometros.
                7. Calcular el area de un círculo.
                8. Calcular el perimetro de un circulo.
                9. Calcular la potencia de un circuito eléctrico.
                10. Calcular porcentaje de descuento de un precio.
                0. Salir.
                """;

    }

    private void optionMenu() {

        try {
            int option = sc.nextInt();

            switch (option) {
                case 1 -> euroConversor.pesetaToEuro();
                case 2 -> euroConversor.euroToPeseta();
                case 3 -> distance.calculateSpeed();
                case 4 -> triangle.area();
                case 5 -> distanceUnitsConversor.kilometerstoMiles();
                case 6 -> distanceUnitsConversor.milesToKilometers();
                case 7 -> circleCLI.area();
                case 8 -> circleCLI.perimeter();
                case 9 -> powerCalculator.powerCal();
                case 10 -> discountCalculator.calculateDiscount();
                case 0 -> {
                    log.debug("¡Hasta luego!");
                    menuTrigger = false;
                }
                default -> log.debug("Opción no válida, reintenta.");
            }
        } catch (InputMismatchException e) {
            log.debug("Error. introduce un número entero válido.");
            sc.nextLine();
        }
    }
}
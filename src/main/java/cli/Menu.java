package cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadInteger;
import java.util.Scanner;

public class Menu {

    boolean menuTrigger = true;
    private final Scanner sc = new Scanner(System.in);
    private final ReadInteger readInteger = new ReadInteger(sc);
    private static final Logger log = LoggerFactory.getLogger(Menu.class);

    CircleCLI circleCLI = new CircleCLI(sc);
    DistanceUnitsConversorCLI distanceUnitsConversor = new DistanceUnitsConversorCLI(sc);
    DiscountCalculatorCLI discountCalculator = new DiscountCalculatorCLI(sc);
    SpeedCalculatorCLI distance = new SpeedCalculatorCLI(sc);
    EuroConversorCLI euroConversor = new EuroConversorCLI(sc);
    PowerCalculatorCLI powerCalculator = new PowerCalculatorCLI(sc);
    TriangleCLI triangle = new TriangleCLI(sc);
    TimeConversorCLI timeConversor = new TimeConversorCLI(sc);

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
                11. Convertir segundos en horas, minutos y segundos.,
                0. Salir.
                """;

    }

    private void optionMenu() {

        Integer option = readInteger.getInteger(printMenu());
        if (option == null) {
            return;
        }

        switch (option) {
            case 1 -> euroConversor.pesetaToEuro();
            case 2 -> euroConversor.euroToPeseta();
            case 3 -> distance.calculateSpeed();
            case 4 -> triangle.area();
            case 5 -> distanceUnitsConversor.meterstoMiles();
            case 6 -> distanceUnitsConversor.milesToMeters();
            case 7 -> circleCLI.area();
            case 8 -> circleCLI.perimeter();
            case 9 -> powerCalculator.powerCal();
            case 10 -> discountCalculator.calculateDiscount();
            case 11 -> timeConversor.conversor();
            case 0 -> {
                log.debug("¡Hasta luego!");
                menuTrigger = false;
                }
                default -> log.debug("Opción no válida, reintenta.");
            }
    }
}
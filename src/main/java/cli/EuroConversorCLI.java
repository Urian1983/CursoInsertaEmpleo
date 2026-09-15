package cli;

import model.EuroConversor;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EuroConversorCLI {
    private final Scanner sc;
    private final EuroConversor euroConversor;
    private static final Logger log = LoggerFactory.getLogger(EuroConversorCLI.class);

    public EuroConversorCLI(Scanner sc, EuroConversor euroConversor) {
        this.sc = sc;
        this.euroConversor = euroConversor;
    }

    public EuroConversorCLI(Scanner sc) {
        this(sc, new EuroConversor());
    }

    public void euroToPeseta(){
        log.debug("Escribe la cantidad de euros a convertir");
        float euros = sc.nextFloat();
        float pesetas = euroConversor.euroToPeseta(euros);
        log.debug("La cantidad de pesetas para {} es {} ", pesetas, euros);
    }

    public void pesetaToEuro(){
        log.debug("Escribe la cantidad de pesetas a convertir");
        float pesetas = sc.nextFloat();
        float euros = euroConversor.pesetaToEuro(pesetas);
        log.debug("La cantidad de euros para {} es {}", pesetas,euros);
    }

}

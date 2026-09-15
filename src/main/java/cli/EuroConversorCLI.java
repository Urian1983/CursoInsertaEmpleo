package cli;

import model.EuroConversor;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

public class EuroConversorCLI {
    private final EuroConversor euroConversor;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(EuroConversorCLI.class);

    public EuroConversorCLI(EuroConversor euroConversor, ReadFloat readFloat) {
        this.euroConversor = euroConversor;
        this.readFloat = readFloat;
    }

    public EuroConversorCLI(Scanner sc) {
        this(new EuroConversor(), new ReadFloat(sc));
    }

    public void euroToPeseta(){
        Float euros = readFloat.getFloat("Escribe la cantidad de euros a convertir");
        if(euros == null){
            return;
        }
        if(euros<0){
            log.error("La cantidad de euros a convertir no puede ser negativa");
            return;
        }

        Float pesetas = euroConversor.euroToPeseta(euros);
        log.debug("La cantidad de pesetas para {} es {} ", pesetas, euros);
    }

    public void pesetaToEuro(){
        Float pesetas = readFloat.getFloat("Escribe la cantidad de pesetas a convertir");
        if(pesetas == null){
            return;
        }
        if(pesetas<0){
            log.error("La cantidad de pesetas a convertir no puede ser negativa");
            return;
        }
        Float euros = euroConversor.pesetaToEuro(pesetas);
        log.debug("La cantidad de euros para {} es {}", euros,pesetas);
    }

}

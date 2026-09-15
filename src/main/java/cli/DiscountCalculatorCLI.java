package cli;

import model.DiscountCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ReadFloat;

import java.util.Scanner;

public class DiscountCalculatorCLI {
    private final DiscountCalculator discountCalculator;
    private final ReadFloat readFloat;
    private static final Logger log = LoggerFactory.getLogger(DiscountCalculatorCLI.class);

    private DiscountCalculatorCLI(DiscountCalculator discountCalculator, ReadFloat readFloat) {
        this.discountCalculator = discountCalculator;
        this.readFloat = readFloat;
    }

    public DiscountCalculatorCLI(Scanner sc) {
        this(new DiscountCalculator(), new ReadFloat(sc));
    }

    public void calculateDiscount(){
        Float originalPrice= readFloat.getFloat("Entra el precio original del producto");
        if(originalPrice == null){
            return;
        }

        Float discountPrice = readFloat.getFloat("Entra el precio en descuento del producto");
        if(discountPrice == null){
            return;
        }

        Float discount = discountCalculator.calculateDiscount(discountPrice, originalPrice);
        log.debug("El descuento aplicado sobre el producto es: {}", discount);
        }
        }




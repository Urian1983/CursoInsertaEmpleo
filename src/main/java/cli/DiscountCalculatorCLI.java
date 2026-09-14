package cli;

import model.DiscountCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DiscountCalculatorCLI {
    private final Scanner sc;
    private final DiscountCalculator discountCalculator;
    private static final Logger log = LoggerFactory.getLogger(DiscountCalculatorCLI.class);

    public DiscountCalculatorCLI(Scanner sc, DiscountCalculator discountCalculator) {
        this.sc = sc;
        this.discountCalculator = discountCalculator;
    }

    public DiscountCalculatorCLI(Scanner sc) {
        this(sc, new DiscountCalculator());
    }

    public void calculateDiscount(){
        log.debug("Entra el precio original del producto");
        float originalPrice = sc.nextFloat();
        log.debug("Entra el precio descontado del producto");
        float discountPrice = sc.nextFloat();
        float discount = discountCalculator.calculateDiscount(discountPrice,originalPrice);
        log.debug("El descuento aplicado sobre el producto es: {}", discount);
    }
}

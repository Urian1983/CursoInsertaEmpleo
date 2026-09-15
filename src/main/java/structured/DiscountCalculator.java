package structured;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra el precio original del producto");
        float originalPrice = sc.nextFloat();
        System.out.println("Entra el precio descontado del producto");
        float discountPrice = sc.nextFloat();

        float percentageDiscountPrice = discountPrice*(100/originalPrice);
        float percentageDiscount = originalPrice-percentageDiscountPrice;

        System.out.println("El porcentaje de descuento es: " + percentageDiscount + "%");
    }
}

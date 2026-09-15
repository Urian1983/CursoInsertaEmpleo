package structured;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el voltaje");
        float voltage = sc.nextFloat();
        System.out.println("Entra la intensidad");
        float capacity = sc.nextFloat();

        float power= voltage*capacity;

        System.out.println("La potencia es " +power +" vatios");
    }
}

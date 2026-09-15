package structured;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el voltaje");
        float voltaje = sc.nextFloat();
        System.out.println("Entra la intensidad");
        float intensidad = sc.nextFloat();

        float power= voltaje*intensidad;

        System.out.println("La potencia es " +power);
    }
}

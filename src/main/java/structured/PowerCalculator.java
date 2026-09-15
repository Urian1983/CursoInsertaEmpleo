package structured;

import java.util.Scanner;

public class PowerCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el voltaje");
        int voltaje = sc.nextInt();
        System.out.println("Entra la intensidad");
        int intensidad = sc.nextInt();

        int power= voltaje*intensidad;

        System.out.println("La potencia es " +power);
    }
}

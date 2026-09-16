package structured;

import java.util.Scanner;

public class MetersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el número de metros");
        float meters = sc.nextFloat();
        float miles = meters/1832f;
        System.out.println("El numero de millas para " +meters +" metros es: " +miles);
    }
}

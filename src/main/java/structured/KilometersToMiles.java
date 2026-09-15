package structured;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el número de kilometros");
        double kilometers = sc.nextDouble();
        double miles = kilometers/1.852;
        System.out.println("El numero de kilometros para " +kilometers +"es: " +miles);
    }
}

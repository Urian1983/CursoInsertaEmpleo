package structured;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el número de millas");
        double miles = sc.nextDouble();
        double kiloneters = miles*1.852;
        System.out.println("El numero de kilometros para " +miles +"es: " +kiloneters);
    }
    }


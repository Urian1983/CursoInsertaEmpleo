package structured;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el número de millas");
        float miles = sc.nextFloat();
        float kiloneters = miles*1.852f;
        System.out.println("El numero de kilometros para " +miles +"es: " +kiloneters);
    }
    }


package structured;

import java.util.Scanner;

public class MilesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el número de millas");
        float miles = sc.nextFloat();
        float meters = miles*1852f;
        System.out.println("El numero de metros para " +miles +" es: " +meters);
    }
    }


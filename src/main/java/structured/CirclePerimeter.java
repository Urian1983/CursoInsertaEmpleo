package structured;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CirclePerimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el radio del círculo");
        int radius  = sc.nextInt();
        double perimeter = 2 * PI * radius;
        System.out.println("el perimetro del círculo es: " + perimeter);
    }


}


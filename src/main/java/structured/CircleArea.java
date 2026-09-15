package structured;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el radio del círculo");
        int radius  = sc.nextInt();
        int powRadius = radius * radius;
        double area = PI * powRadius;
        System.out.println("el area del círculo es: " + area);

    }
}

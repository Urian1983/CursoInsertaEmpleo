package structured;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra la distancia recorrida");
        int distance = sc.nextInt();
        System.out.println("Entra el tiempo que ha tardado");
        int hours = sc.nextInt();

        float speed = (float) distance/hours;

        System.out.println("La velocidad media durante el recorrido es: " +speed);
    }
}

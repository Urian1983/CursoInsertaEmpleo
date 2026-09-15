package structured;

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra la distancia recorrida");
        float distance = sc.nextInt();
        System.out.println("Entra el tiempo que ha tardado");
        float hours = sc.nextInt();

        float speed = distance/hours;

        System.out.println("La velocidad media durante el recorrido es: " +speed);
    }
}

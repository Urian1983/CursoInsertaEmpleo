package structured;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra la base del triángulo");
        int base = sc.nextInt();
        System.out.println("Entra la altura del triangulo");
        int altura = sc.nextInt();

        float area = (float)(base*altura)/2;
        System.out.println("El area del triangulo es " +area);
    }
}

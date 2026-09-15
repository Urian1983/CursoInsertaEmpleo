package structured;

import java.util.Scanner;

public class PesetaToEuro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de pesetas a convertir");
        double pesetas= sc.nextDouble();
        double euros = pesetas/166.387;
        System.out.println("La cantidad de euros para " +pesetas +" pesetas es " +euros);
    }
}

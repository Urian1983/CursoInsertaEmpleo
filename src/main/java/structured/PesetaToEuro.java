package structured;

import java.util.Scanner;

public class PesetaToEuro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de pesetas a convertir");
        float pesetas= sc.nextFloat();
        float euros = pesetas/166.387f;
        System.out.println("La cantidad de euros para " +pesetas +" pesetas es " +euros);
    }
}

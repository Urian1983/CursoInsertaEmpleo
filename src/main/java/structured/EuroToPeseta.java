package structured;

import java.util.Scanner;

public class EuroToPeseta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la cantidad de euros a convertir");
        float euros = sc.nextFloat();
        float pesetas = euros*166.387f;
        System.out.println("La cantidad de pesetas para " +euros +" euros es " +pesetas);
    }
}

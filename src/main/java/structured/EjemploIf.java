package structured;

import java.util.Scanner;

public class EjemploIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");

        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Son iguales");
            if (num1>num2){
                System.out.println("El mayor es " +num1);
            }
            else{
                System.out.println("El mayor es " +num2);
            }
        }
    }
}

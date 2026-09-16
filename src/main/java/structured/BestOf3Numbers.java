package structured;

import java.util.Scanner;

public class BestOf3Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el primer número");
        int num1= sc.nextInt();
        int menor= num1;

        System.out.println("Entra el segundo número, distinto al primero");
        int num2= sc.nextInt();
        int medio = num2;

        if(num2== num1){
            System.out.println("Los números han de ser distintos entre ellos");
            num2= sc.nextInt();
            medio = num2;
        }

        System.out.println("Entra el tercer número, distinto al primero y al segundo");
        int num3= sc.nextInt();
        int mayor=num3;

        if(num3==num2 || num3==num1){
            System.out.println("Los números han de ser distintos entre ellos");
            num3= sc.nextInt();
            mayor=num3;
        }

        if(num1>num2 && num3>num2) {
            if (num1 > num3) {
                mayor = num1;
                medio = num3;
                menor = num2;
            }
        }
        if(num1>num2 && num3<num2){
            mayor= num1;
            medio= num3;
            menor= num2;
            }
        if(num1<num2 && num3<num2) {
            mayor= num2;
            if(num1>num3){
                menor=num3;
                medio= num1;
            }
        }
        System.out.println("El mayor es: " +mayor + " seguido de " +medio +" y " +menor);
    }
}

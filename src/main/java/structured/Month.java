package structured;

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        int month = sc.nextInt();

        if(month<1 || month>12){
            System.out.println("Solo hay 12 meses");
            month = sc.nextInt();
        }

        if(month==1){
            System.out.println("Enero");
        }

        if(month==2){
            System.out.println("Febrero");
        }

        if(month==3){
            System.out.println("Marzo");
        }

        if(month==4){
            System.out.println("Abril");
        }

        if(month==5){
            System.out.println("Mayo");
        }

        if(month==6){
            System.out.println("Junio");
        }

        if(month==7){
            System.out.println("Julio");
        }

        if(month==2){
            System.out.println("Agosto");
        }

        if(month==3){
            System.out.println("Septiembre");
        }

        if(month==4){
            System.out.println("Octubre");
        }

        if(month==5){
            System.out.println("Noviembre");
        }

        if(month==6){
            System.out.println("Diciembre");
        }


    }
}

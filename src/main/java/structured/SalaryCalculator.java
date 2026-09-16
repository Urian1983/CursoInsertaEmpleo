package structured;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        float salary;
        int hours;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cual es tu salario?");
        System.out.println("");
        salary = sc.nextFloat();

        System.out.println("¿Cuantas horas has trabajado esté ultimo mes");
        hours = sc.nextInt();

        float salaryPerHour = salary/hours;

        if(hours<=40){
            System.out.println("Tu salario debería ser: " +salary);
        }

        if(hours>40 && hours<=48){
            salary= (40 * salaryPerHour) + (hours-40) * (2*salaryPerHour);
            System.out.println("Tu salario debería ser: " +salary);
        }

        if(hours>48){
            salary= (40 * salaryPerHour) + (hours-40) *(2*salaryPerHour) + (hours-48)*(3*salaryPerHour);
            System.out.println("Tu salario debería ser: " +salary);
        }
    }





}

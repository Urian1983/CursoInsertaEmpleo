package structured;

import java.util.Scanner;

public class StudentQualifications {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la nota del alumno");
        float qualification = sc.nextFloat();

        if(qualification<0 || qualification>10){
            System.out.println("Las notas van de 0 a 10");
            qualification = sc.nextFloat();
        }

        if(qualification>0 && qualification<3){
            System.out.println("Tu cualificación es Muy deficiente");
        }
        if(qualification>3 && qualification<5){
            System.out.println("Tu cualificación es Insuficiente");
        }
        if(qualification>5 && qualification<6){
            System.out.println("Suficiente, aprobado por los pelos");
        }

        if(qualification>6 && qualification<7){
            System.out.println("Bién, pero puedes mejorar");
        }
        if(qualification>7 && qualification<9){
            System.out.println("Tu cualificación es Notable, ¿puedes llegar al excelente?");
        }
        if(qualification>9 && qualification<10){
            System.out.println("Excelente, felicidades");
        }
        if(qualification ==10){
            System.out.println("Matricula, no se puede hacer mejor");
        }
    }
}

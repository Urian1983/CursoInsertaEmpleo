package structured;

import java.util.Scanner;

public class TimeConversor {
    public static void main(String[] args) {

        int seconds=0;
        int minutes=0;
        int hours;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los segundos que quieres convertir a horas y minutos");
        int secondsToConvert = sc.nextInt();

        int minutesToConvert = secondsToConvert / 60;
        seconds=seconds+secondsToConvert % 60;

        hours = minutesToConvert / 60;
        minutes=minutes+minutesToConvert % 60;

        System.out.println("El tiempo para " +seconds+" segundos es: " +hours+":"+minutes+":"+seconds);
    }
}

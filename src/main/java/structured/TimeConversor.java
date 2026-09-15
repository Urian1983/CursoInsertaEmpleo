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
        int carriedSeconds = secondsToConvert % 60;
        seconds=seconds+carriedSeconds;

        hours = minutesToConvert / 60;
        int carriedMinutes = minutesToConvert % 60;
        minutes=minutes+carriedMinutes % 60;

        System.out.println("El tiempo para " +secondsToConvert+" segundos es: " +hours+" horas "+minutes+" minutos "+seconds +" segundos");
    }
}

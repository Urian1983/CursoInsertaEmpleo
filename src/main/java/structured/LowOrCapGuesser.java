package structured;

import java.util.Scanner;

public class LowOrCapGuesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una letra");
        String charTemp = sc.next();

        char character =  charTemp.charAt(0);
        int value = character;
        if(value>=65 && value<97){
            System.out.println("La letra es minuscula");
        }
        else if(value>=97 && value<91){
            System.out.println("La letra es mayuscula");
        }
    }


}

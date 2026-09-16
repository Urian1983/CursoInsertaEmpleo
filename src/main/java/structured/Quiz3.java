package structured;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        quiz();




    }

    private static void quiz() {
        Scanner sc = new Scanner(System.in);
        String charTemp;
        char answer;
        int score;
        score = 0;
        System.out.println("Vamos a hacerte tres preguntas de cultura general, responde con s o n");

        System.out.println("1. ¿Colon descubrio america?");
        charTemp = sc.next();
        answer = charTemp.charAt(0);

        if(answer =='s' || answer == 'S'){
            System.out.println("Respuesta Correcta");
            score++;
        }
        else if(answer =='n' || answer == 'N'){
            System.out.println("Respuesta Incorrecta");
        }
        else{
            System.out.println("Responde con s o n");
            return;
        }

        System.out.println("2. ¿La capital de inglaterra es Cambridge?");
        charTemp = sc.next();
        answer = charTemp.charAt(0);
        if(answer =='s' || answer == 'S'){
            System.out.println("Respuesta Incorrecta");
        }
        else if(answer =='n' || answer == 'N'){
            System.out.println("Respuesta Correcta");
            score++;
        }
        else{
            System.out.println("Responde con s o n");
            return;
        }

        System.out.println("3. ¿El sol es una estrella?");
        charTemp = sc.next();
        answer = charTemp.charAt(0);

        if(answer =='s' || answer == 'S'){
            System.out.println("Respuesta Correcta");
            score++;
        }
        else if(answer =='n' || answer == 'N'){
            System.out.println("Respuesta Incorrecta");
        }
        else{
            System.out.println("Responde con s o n");
            return;
        }

        sc.close();

        System.out.println("Has acertado " + score +" respuestas correctas");

    }

}

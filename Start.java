
import java.util.Scanner;



public class Start{
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);
        int Score = 0;
        
        String[][] Options = {
            {"1. Brasília", "2. Rio de Janeiro", "3. São Paulo", "4. Salvador"},
            {"1. Java", "2. Python", "3. C++", "4. JavaScript"},
            {"1. Uma bebida", "2. Uma ilha", "3. Uma linguagem de programação", "4. Um carro"},
            {"1. Terra", "2. Marte", "3. Júpiter", "4. Mercúrio"}
        };

        String[] Questions = {
            "Qual a capital do Brasil?",
            "Qual a linguagem de programação mais utilizada?",
            "O que é Java?",
            "Qual é o planeta vermelho?"
        };

        int[] answers = {1,2,3,2};
        
        for (int i = 0; i < Questions.length; i++){
            System.out.println(Questions[i]);
            for (String Option: Options[i]){
                System.out.println(Option);
            }
            System.out.println("Digite o numero da sua respota: ");
            int response = scanner.nextInt();
            if (response == answers[i]){
                Score++;
                System.out.println("Acertou!");
            }else{
                System.out.println("Errou!");
            }
        }
        
        if (Score == 4){
            System.out.println("Nota Maxima: " + Score);
        }else{
            System.out.println("\n \n Sua Portuação final: " + Score);
        }

    }


}
package ejercicio3;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase=sc.nextLine();
        System.out.println(frase);
        int numberChar=0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                numberChar++;
            }
        }
        System.out.println("numero de veces :"+numberChar);
    }
}

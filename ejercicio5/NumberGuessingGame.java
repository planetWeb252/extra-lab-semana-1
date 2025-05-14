package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int numero = 0;
        int intentos = 0;

        while (numero != secretNumber) {
            System.out.print("Introduce tu numero: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                intentos++;

                if (numero < secretNumber) {
                    System.out.println("El número es mayor.");
                } else if (numero > secretNumber) {
                    System.out.println("El número es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    System.out.println("Número de intentos: " + intentos);
                }
            } else {
                System.out.println("Por favor, introduce un número válido.");
                sc.next();
            }
        }

        sc.close();
    }






}

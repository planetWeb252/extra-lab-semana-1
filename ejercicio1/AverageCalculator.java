package ejercicio1;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que desea promediar.");
        int userNumber=sc.nextInt();
        double suma=0;
        for (int i = 0; i <userNumber ; i++) {
            System.out.println("Introduce el numero "+(i+1));
            suma+=sc.nextInt();
        }
        double average=suma/userNumber;
        System.out.println("El promedio es :"+average);
    }

}

package ejercicio2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numberUser=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberUser +" * "+ i+" "+"= "+numberUser*(i) );
        }
    }
}

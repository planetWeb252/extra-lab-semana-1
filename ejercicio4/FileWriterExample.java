package ejercicio4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el nombre del archivo : ");
            String fileName = sc.nextLine();
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Introduce líneas de texto (línea vacía para terminar):");
            while (true) {
                String line = sc.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("Guardado correctamente en el archivo: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            sc.close();
        }
    }

}

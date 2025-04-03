# LAB | Repaso semana 1

## Objetivos

- Practicar la declaración y manipulación de variables en Java.
- Utilizar bucles for y while para resolver problemas.
- Leer datos desde la consola utilizando la clase Scanner.
- Escribir datos en archivos de texto utilizando la clase FileWriter.
- Desarrollar habilidades de resolución de problemas y pensamiento lógico.

## Ejercicio 1: Calculadora de Promedio

- **Objetivo**: Calcular el promedio de una serie de números introducidos por el usuario. El propio usuario nos dirá cuántos números desea promediar y nos dará cada uno de ellos.

- **Instrucciones**:

  1.  Crea un archivo con una clase llamada `AverageCalculator`.
  2.  Dentro de la clase `AverageCalculator`, en el método `main`, declara una variable `Scanner` para leer la entrada del usuario.
  3.  Pide al usuario que introduzca la cantidad de números que desea promediar.
  4.  Utiliza un bucle `for` para pedir al usuario que introduzca cada número.
  5.  Calcula la suma de los números introducidos.
  6.  Divide la suma por la cantidad de números para obtener el promedio.
  7.  Muestra el promedio en la consola.

<details>
<summary>Solución paso a paso</summary>

1. Crea un archivo con la clase llamada `AverageCalculator`.
2. Importa la clase Scanner con `import java.util.Scanner;`.
3. Define el método `main` (puedes usar la abreviación de teclado psvm en IntelliJ).
4. Crea un objeto Scanner: `Scanner scanner = new Scanner(System.in);`.
5. Solicita al usuario la cantidad de números: `System.out.println("Introduce la cantidad de números a promediar: ");`.
6. Lee el valor con `int count = scanner.nextInt();`.
7. Inicializa una variable para la suma: `double sum = 0;`.
8. Crea un bucle for desde 1 hasta count: `for (int i = 1; i <= count; i++)`.
9. Dentro del bucle, solicita cada número y súmalo a la variable sum.
10. Calcula el promedio con `double average = sum / count;`.
11. Muestra el resultado con `System.out.println("El promedio es: " + average);`.
12. Cierra el Scanner con `scanner.close();`.

```java
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números a promediar: ");
        int count = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.println("Introduce el número " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double average = sum / count;
        System.out.println("El promedio es: " + average);

        scanner.close();
    }
}
```

</details>

## Ejercicio 2: Generador de Tablas de Multiplicar

- **Objetivo**: Generar la tabla de multiplicar de un número introducido por el usuario.

- **Instrucciones**:

  1.  Crea un archivo con la clase llamada `MultiplicationTable`.
  2.  Dentro de la clase `MultiplicationTable`, en el método `main`, declara una variable `Scanner` para leer la entrada del usuario.
  3.  Pide al usuario que introduzca un número entero.
  4.  Utiliza un bucle `for` para generar la tabla de multiplicar del 1 al 10.
  5.  Muestra cada línea de la tabla de multiplicar en la consola.

<details>
<summary>Solución paso a paso</summary>

1. Crea un archivo con la clase llamada `MultiplicationTable`.
2. Importa la clase Scanner con `import java.util.Scanner;`.
3. Define el método público y estático `main` (con psvm lo puedes generar automáticamente).
4. Crea un objeto Scanner: `Scanner scanner = new Scanner(System.in);`. Esto nos permitirá leer aquello que escriba el usuario en la consola.
5. Solicita al usuario un número: `System.out.println("Introduce un número para generar su tabla de multiplicar: ");`.
6. Lee el valor con tu scanner `int number = scanner.nextInt();`. Como estamos solicitando un número entero, lo guardamos en una variable de tipo int.
7. Crea un bucle for desde 1 hasta 10: `for (int i = 1; i <= 10; i++)`.
8. Dentro del bucle, calcula y muestra el resultado de cada multiplicación. Utiliza un `System.out.println` para mostrar el resultado en la consola: `System.out.println(number + " x " + i + " = " + (number * i));`.
9. Cierra el Scanner con `scanner.close();`.

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número para generar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
```

</details>

## Ejercicio 3: Contador de Vocales

- **Objetivo**: Contar el número de vocales en una frase introducida por el usuario.

- **Instrucciones**:

  1.  Crea una clase llamada `VowelCounter`.
  2.  Dentro de la clase `VowelCounter`, en el método `main`, declara una variable `Scanner` para leer la entrada del usuario.
  3.  Pide al usuario que introduzca una frase.
  4.  Utiliza un bucle `for` para recorrer cada carácter de la frase.
  5.  Utiliza una estructura `if` o `switch` para verificar si cada carácter es una vocal.
  6.  Incrementa un contador cada vez que se encuentre una vocal.
  7.  Muestra el número total de vocales en la consola.

<details>
<summary>Solución paso a paso</summary>

1. Crea un archivo con la clase llamada `VowelCounter`.
2. Importa la clase Scanner con `import java.util.Scanner;`.
3. Define el método `main` (puedes usar la abreviación de teclado psvm en IntelliJ).
4. Crea un objeto Scanner: `Scanner scanner = new Scanner(System.in);`.
5. Solicita al usuario una frase: `System.out.println("Introduce una frase: ");`.
6. Lee la frase con `String phrase = scanner.nextLine();`.
7. Convierte la frase a minúsculas para facilitar la comparación: `phrase = phrase.toLowerCase();`.
8. Inicializa un contador de vocales: `int vowelCount = 0;`.
9. Crea un bucle for para recorrer cada carácter: `for (int i = 0; i < phrase.length(); i++)`.
10. Dentro del bucle, obtén el carácter actual: `char ch = phrase.charAt(i);`.
11. Verifica si es una vocal y aumenta el contador si es el caso.
12. Muestra el resultado final.
13. Cierra el Scanner con `scanner.close();`.

```java
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String phrase = scanner.nextLine();

        // Convertir a minúsculas para simplificar la comparación
        phrase = phrase.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);

            // Verificar si el carácter es una vocal
            // como ya lo hemos convertido a minúsculas, no es necesario comparar con mayúsculas
            // para comparar caracteres, lo podemos hacer con == porque son primitivos
            // si lo hiciéramos con Strings, tendríamos que usar el método equals()
            // o equalsIgnoreCase() para ignorar mayúsculas y minúsculas
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("La frase contiene " + vowelCount + " vocales.");

        scanner.close();
    }
}
```

</details>

## Ejercicio 4: Escritura en Archivo

- **Objetivo**: Escribir una serie de líneas de texto en un archivo.

- **Instrucciones**:

  1.  Crea un archivo con la clase llamada `FileWriterExample`.
  2.  Dentro de la clase `FileWriterExample`, en el método `main`, declara una variable `Scanner` para leer la entrada del usuario.
  3.  Pide al usuario que introduzca el nombre del archivo en el que desea escribir.
  4.  Pide al usuario que introduzca líneas de texto, una por una.
  5.  Utiliza un bucle `while` para leer las líneas de texto hasta que el usuario introduzca una línea vacía.
  6.  Utiliza la clase `FileWriter` para escribir cada línea de texto en el archivo.
  7.  Cierra el archivo.

<details>
<summary>Solución paso a paso</summary>

1. Crea un archivo Java con la clase llamada `FileWriterExample`.
2. Importa las clases necesarias:
   ```java
   import java.util.Scanner;
   import java.io.FileWriter;
   import java.io.IOException;
   ```
3. Define la clase `FileWriterExample` con su método `main`.
4. Crea un objeto Scanner: `Scanner scanner = new Scanner(System.in);`.
5. Solicita el nombre del archivo: `System.out.println("Introduce el nombre del archivo: ");`.
6. Lee el nombre con `String fileName = scanner.nextLine();`.
7. Usa un bloque try-catch para manejar excepciones de E/S.
8. Dentro del try, crea un FileWriter: `FileWriter writer = new FileWriter(fileName);`.
9. Explica al usuario cómo terminar la entrada: `System.out.println("Introduce líneas de texto (línea vacía para terminar):");`.
10. Usa un bucle while para leer líneas hasta que sea vacía.
11. Dentro del bucle, escribe cada línea al archivo y añade un salto de línea.
12. Cierra el writer y el scanner.
13. Muestra un mensaje de confirmación.

```java
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample throws IOException { // en el caso de error con el archivo, necesitamos este throws (veremos más adelante cómo gestionarlo)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo: ");
        String fileName = scanner.nextLine();


            FileWriter writer = new FileWriter(fileName);

            System.out.println("Introduce líneas de texto (línea vacía para terminar):");

            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.isEmpty()) { // si la línea está vacía, terminamos el bucle
                // si no, podemos seguir hasta el infinito! 😂
                    break;
                }
                writer.write(line + "\n");
            }

            writer.close();
            System.out.println("El archivo se ha escrito correctamente.");



        scanner.close();
    }
}
```

</details>

## Ejercicio 5: Juego de Adivinanza de Números

- **Objetivo**: Crear un juego en el que el usuario debe adivinar un número aleatorio generado por el programa.

- **Instrucciones**:

  1.  Crea un archivo con la clase llamada `NumberGuessingGame`.
  2.  Dentro de la clase `NumberGuessingGame`, en el método `main`, genera un número aleatorio entre 1 y 100. (Utiliza Math.random() o la clase Random)
      Ejemplo de uso de random:

  ```java
  Random random = new Random();
  int secretNumber = random.nextInt(100) + 1; // Genera un número int aleatorio entre 1 y 100
  ```

  3.  Pide al usuario que adivine el número.
  4.  Utiliza un bucle `while` para permitir al usuario hacer intentos hasta que adivine el número.
  5.  Proporciona pistas al usuario ("El número es mayor" o "El número es menor") después de cada intento.
  6.  Muestra un mensaje de felicitación cuando el usuario adivine el número.
  7.  Muestra el número de intentos que necesitó el usuario para adivinar el número.

<details>
<summary>Solución paso a paso</summary>

1. Crea un archivo Java llamado `NumberGuessingGame.java`.
2. Importa las clases necesarias:
   ```java
   import java.util.Scanner;
   import java.util.Random;
   ```
3. Define la clase `NumberGuessingGame` con su método `main`.
4. Crea un objeto Scanner: `Scanner scanner = new Scanner(System.in);`.
5. Crea un objeto Random: `Random random = new Random();`.
6. Genera un número aleatorio entre 1 y 100: `int secretNumber = random.nextInt(100) + 1;`.
7. Inicializa un contador de intentos: `int attempts = 0;`.
8. Inicializa una variable para la suposición del usuario: `int guess = 0;`.
9. Crea un bucle while que continúe hasta que el usuario adivine el número.
10. Dentro del bucle:
    - Solicita al usuario una suposición
    - Incrementa el contador de intentos
    - Compara la suposición con el número secreto
    - Proporciona retroalimentación ("mayor", "menor" o "correcto")
11. Después del bucle, muestra un mensaje de felicitación y el número de intentos.
12. Cierra el Scanner con `scanner.close();`.

```java
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar número aleatorio entre 1 y 100
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("¡Bienvenido al Juego de Adivinanzas!");
        System.out.println("He pensado en un número entre 1 y 100.");

        // Bucle hasta que el usuario adivine el número
        while (guess != secretNumber) {
            System.out.print("Introduce tu suposición: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("El número es mayor. Inténtalo de nuevo.");
            } else if (guess > secretNumber) {
                System.out.println("El número es menor. Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                System.out.println("Has necesitado " + attempts + " intentos.");
            }
        }

        scanner.close();
    }
}
```

</details>

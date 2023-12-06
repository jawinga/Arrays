import java.util.Random;
import java.util.Scanner;
//1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
// Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//    - Ver todas las palabras: mostrarla todas las palabras del array
//    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
//    - Ver palabra con más letras
//    - Ver palabra con menos letras

public class Loads_arrays {
    public static void main(String[] args) {
        //1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10];
        int opcion = 0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduzca una palabra");
            palabras[i] = scanner.next();

        }

        // Una vez hecho esto saldrá un menú que me dará las siguientes opciones:

        System.out.println("Choose from the different options: ");
        System.out.println("1. Ver todas las palabras: mostrarla todas las palabras del array.");
        System.out.println("2. Obtener una palabra al azar: mostrará una palabra de las que existen en el array.");
        System.out.println("3. Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras y su media.");
        System.out.println("4. Ver palabra con más letras. ");
        System.out.println("5. Ver palabra con menos letras.");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                //    - Ver todas las palabras: mostrarla todas las palabras del array
                System.out.println("Estas son las palabras introducidas: ");
                for (String muestra : palabras) {
                    System.out.println(muestra + " ");
                }
            case 2:
                //Obtener una palabra al azar: mostrará una palabra de las que existen en el array. IMPORTANTE: importar random

                Random random = new Random();
                String randomElement = palabras[random.nextInt(palabras.length)];

                System.out.println("La palabra al azar escogida del array es: " + randomElement);

            case 3:
                //Ver numeros de letras: mostrará el número de letras que hay en total entre todas las palabras.
                //Ver media de letras: mostrará el número medio de letras entre todas las palabas
                //int suma = 0;
                int suma_total = 0;
                for (int i = 0; i < palabras.length; i++) {
                    int suma_palabra = 0;
                    suma_palabra = suma_palabra + palabras[i].length();
                    suma_total = suma_palabra + suma_total;
                }
                System.out.println();
                System.out.print("La suma total de las letras en todas las letras seria " + suma_total);
                System.out.println();
                System.out.print("La media total de las letras en todas las letras seria " + (double) (suma_total / 10));
                break;


            case 4:
                //Ver palabra con más letras
                int palabra_max = 0;
                for (int i = 0; i < palabras.length; i++) {
                    int suma_palabra = 0;
                    suma_palabra = suma_palabra + palabras[i].length();

                    if (suma_palabra > palabra_max) {

                        palabra_max = suma_palabra;

                        //System.out.println(palabra_max);

                    }

                }
                System.out.println(palabra_max);
                break;



            case 5:
                //Ver palabra con menos letras
                int palabra_min = 100; // Assuming maximum length of a word is 100
                String palabra_min_length_word = "";

                for (int i = 0; i < palabras.length; i++) {
                    int suma_palabra = palabras[i].length();

                    if (suma_palabra < palabra_min) {
                        palabra_min = suma_palabra;
                    }
                }

                System.out.println(palabra_min);
                break;


            default://insertar do while
                System.out.println("Error.");
        }


    }

}




import java.util.Scanner;
import java.util.Random;
public class Array_Ej6_EjerciciosClase {

    //1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
    //    1 Crear un de chars con todas las letras del abecedario.
    //    2 Crear un array de String con una longitud pedida por teclado
    //    3 Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2.
    //      Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada
    //     (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
    //    4 Imprimir por pantalla las palabras generadas

    public static void main(String[] args) {
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la longitud del array de palabras");
        int cantidad_palabras = scanner.nextInt();
        String[] longitudpalabra = new String[cantidad_palabras];

        Random random = new Random();

        for (int i = 0; i < longitudpalabra.length; i++) {
            System.out.println("Indique el numero de letras en cada palabra");
            int longitud = scanner.nextInt();

            // Construir la palabra con letras aleatorias
            char[] palabra = new char[longitud];
            for (int j = 0; j < longitud; j++) {
                palabra[j] = abecedario[random.nextInt(abecedario.length)];
            }

            // Convertir el array de chars a String y guardarlo en el array del apartado 2
            longitudpalabra[i] = String.valueOf(palabra);
        }

        // Imprimir las palabras generadas aleatoriamente
        System.out.println("Palabras generadas:");
        for (String n : longitudpalabra) {
            System.out.println(n);
        }
    }



    }


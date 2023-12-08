import java.util.Scanner;
//1. (MultiplicarArray) Crear un array de 5 posiciones:
//    - se le pedirá al usuario que introduzca cada unos de los elementos del array
//    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
//    - Saca por consola la suma de todos los números
//    - Saca la media de todos los elementos

public class Array_Ej1_EjerciciosClase {
    public static void main(String[] args) {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int [5];


        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Introduzca un numero "); // se le pedirá al usuario que introduzca cada unos de los elementos del array
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            numeros[i]=numeros[i]*2; //Multiplica cada elemento del array * 2 y vuelve a guardar su valor

        }


        int suma = 0;
        int suma_total= 0;


        for (int n:numeros) {

            contador++;
            System.out.println("El numero introducido " + contador + " es multiplicado por dos y su resultado es " + n);
        }


        //    - Saca por consola la suma de todos los números
        //    - Saca la media de todos los elementos

        for (int n:numeros) {

            suma += n;
        }

        System.out.println("La suma total de todos los elementos es: " + suma);
        System.out.println("La media de todos los elementos es: " + suma/5);

    }
}

import java.util.Scanner;

//Realiza un programa que pida 10 números por teclado y que los almacene en un array.
// A continuación se mostrará el contenido de ese array junto al índice (0 – 9)

public class Almacena_arrays {

    public static void main(String[] args) {
        //Creo un array de 10 posiciones
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        //Relleno el array con 10 numeros
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero: ");
            numeros[i] = scanner.nextInt();
        }

        //El for i incremento por 1 cada vez que recorre el for y ademas representa los arrays incluidos.
        for (int i = 0; i < numeros.length; i++) {

            System.out.println((i + 1) + ". " + numeros[i]);

        }

    }

}



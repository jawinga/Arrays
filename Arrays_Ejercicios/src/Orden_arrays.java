import java.util.Scanner;
//3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
//    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido

public class Orden_arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero");
            numeros[i] = scanner.nextInt();
        }


        for (int muestra:numeros) {
            System.out.print(muestra + " ");

        }

        numeros[0] = numeros[10];
        numeros[1] = numeros[8];
        numeros[2] = numeros[7];
        numeros[3] = numeros[6];
        numeros[4] = numeros[5];

        System.out.println();

        for (int muestra:numeros) {
            System.out.print(muestra + " ");

        }

    }

}

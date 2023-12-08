import java.util.Scanner;
//2. (MayorArray) Crea una aplicación que realice lo siguiente:
//    - pida por pantalla la longitud del array de enteros
//    - crea el array de enteros con la longitud introducida
//    - pida al usuario que introduzca todos los datos del array
//    - saque por pantalla el elemento mayor y el elemento menor
public class Array_Ej2_EjerciciosClase {
    public static void main(String[] args) {
        //pida por pantalla la longitud del array de enteros

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array: ");
        int tamano_array = scanner.nextInt();

        int [] array = new int[tamano_array];

        //crea el array de enteros con la longitud introducida
        //pida al usuario que introduzca todos los datos del array
        System.out.println("Complete los elementos del array. ");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca un numero");
            array[i] = scanner.nextInt();

        }

        //    - saque por pantalla el elemento mayor y el elemento menor
        int elemento_mayor=array[0];

        for (int j : array) {

            if (j > elemento_mayor) {

                elemento_mayor = j;

            }

        }

        int elemento_menor=array[0];

        for (int j : array) {

            if (j < elemento_menor) {

                elemento_menor = j;

            }

        }

        System.out.println("el numero mas grande del array es " + elemento_mayor);
        System.out.println("el numero mas grande del array es " + elemento_menor);






    }

}

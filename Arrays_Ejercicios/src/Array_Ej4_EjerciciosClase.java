import java.util.Scanner;

//    4 mueva una posición todos los elementos. el elemento de la posición 0
//    pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
//    5 realizar la tarea anterior pero al contrario.
//    El elemento que está en la primera posición pasa a la última y así sucesivamente

public class Array_Ej4_EjerciciosClase {

    public static void main(String[] args) {

        // 1 pida por teclado la longitud de un array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la longitud del array");
        int longitud = scanner.nextInt();

        // 2 cree el array de enteros de la longitud introducida
        int[] array = new int[longitud];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca los contenidos del array");
            array[i] = scanner.nextInt();
        }

        // Guardar el último elemento en una variable temporal
        int temp = array[array.length - 1];

        // Mover cada elemento una posición a la derecha
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // El último elemento se convierte en el primer elemento
        array[0] = temp;

        // Mostrar el arreglo después de mover los elementos
        System.out.println("Arreglo después de mover una posición todos los elementos:");
        for (int n : array) {
            System.out.println(n);
        }
    }
}

// [0] [1] [2] [3] [4] [5]
// [5] [4] [3] [2] [1] [0]
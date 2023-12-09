import java.util.Scanner;
import java.util.Random;

//1. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9,
// ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio.
// Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
//- Incrementar en 1 los valores pares y en -1 los impares. x
//- Duplicar los valores positivos menores que 5 x
//- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
//- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
//segundo al tercero, ..., y el último al primero).
//- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
//- Invertir el array
//- Mostrar la posición del primer par y del último impar.
public class Array_Ej5_EjerciciosClase {
    public static void main(String[] args) {

        int [] array = {0,1,2,3,4,5,6,7,8,9};

        int min = -5;
        int max = 5;

        Random rand = new Random();
        int randomNumber = rand.nextInt(max - min + 1) + min;

        for (int i = 0; i < array.length; i++) {

            if (array[i]%2==0) {
                array[i]++;
            }else array[i]--;

            if (array[i] <5){
                array[i]= array[i]*2;

            }

        }

        for (int i = 0; i < array.length; i++) {

            array[i] = array[i] + randomNumber;

        }

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }


        for (int j : array) {
            if (j % 2 == 0) {

                System.out.println("El primer numero par es " + j);
                break;
            }

        }

        for (int j : array) {
            if (j % 2 != 0) {

                System.out.println("El primer numero par es " + j);
                break;
            }

        }



        for (int n:array) {

            System.out.print(n + "; ");



        }
        System.out.println();




    }
}

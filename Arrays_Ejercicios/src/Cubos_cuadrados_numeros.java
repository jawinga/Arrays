import java.util.Scanner;
//4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
// Carga el array numero con valores aleatorios entre 0 y 100.
//    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
//    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.


public class Cubos_cuadrados_numeros {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int [20];
        int[] cubo = new int [20];


        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random() * 99);
        }
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int)(Math.random() * 99);
        }
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int)(Math.random() * 99);
        }



        for (int each1: numero) {
            System.out.print(each1 + " ");
        }

        System.out.println();


        for (int each2: cuadrado) {
            System.out.print(each2 + " ");

        }

        System.out.println();

        for (int each3: cubo) {
            System.out.print(each3 + " ");

        }

        System.out.println();
        System.out.println();

        cuadrado=numero;
        cubo=numero;

        for (int each1: numero) {
            System.out.print(each1 + " ");
        }

        System.out.println();


        for (int each2: cuadrado) {
            System.out.print(each2 + " ");

        }

        System.out.println();

        for (int each3: cubo) {
            System.out.print(each3 + " ");

        }

        int [][] columnas = new int[20][3];



    }


}

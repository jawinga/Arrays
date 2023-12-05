
//2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
// Una vez metidos, se deberá mostrar:
//    - Numero de puntos obtenidos
//    - Media de puntos obtenidos

public class Array_medias {

    public static void main(String[] args) {

        //creo un array de 30 posiciones y establezco un int suma igualado a 0.
        int suma = 0;
        int [] numeros = new int [30];

        //relleno todas las posiciones del array con un numero aleatorio
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((int) (Math.random() * 10+1));

        }

        //para realizar la suma total de todos las posiciones.
        for (int numero : numeros) {
            suma = suma + numero;
        }

        System.out.println("Estos son los numeros generados:");

        for (int cada:numeros) {
            System.out.print(cada + " ");
        }
        System.out.println();
        System.out.println("La media total es: " + (double)suma/30);


    }

}

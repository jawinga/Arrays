import java.util.Scanner;
import java.util.Random;

//1. (AhorcadoArray) Crear un array de String donde se guarden 20 palabras.
// El sistema deberá de seleccionar una de las palabras pertenecientes al array.
// Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada.
// Para ello las normas son las siguientes:
//    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar x
//    - Se pedirá por pantalla la letra con la que se quiere probar
//    - En el caso de acertar se mostrará la letra en la posición correspondiente
//    - En el caso de falla se restará una vida
//    - El programa continuará hasta que:
//    - Acierte la palabra
//    - Me quede sin vidas

public class Ahorcado {

    public static void main(String[] args) {

        String [] palabras = {"hello", "dance", "job", "java", "programming", "difficult", "skyrim", "coffee", "iphone", "headphones" };
        char [] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String randomElement = palabras[random.nextInt(palabras.length)];
        String espacios = "_";


        System.out.println(randomElement);
        int contador = randomElement.length();
        System.out.println(contador);


        for (int i = 0; i < randomElement.length(); i++) {

            System.out.print(espacios);

        }

        System.out.println();

        for (int i = 0; i < randomElement.length(); i++) {

            System.out.println("Indique la letra que quiere introducir");
            String letra = scanner.next();

        }






    }
}

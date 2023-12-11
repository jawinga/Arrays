import java.util.*;

//- sacar por pantalla el orden de las parejas resultantes

public class AmigoInvisible_Array {

    public static void main(String[] args) {
        //- pedir el número de participantes (de ser impar o dos saltará un fallo)

        Scanner scanner = new Scanner(System.in);
        int numero_participantes = 0;

        do {
            System.out.println("Introduzca el numero de participantes del sorteo: ");
            numero_participantes = scanner.nextInt();

            if (numero_participantes % 2 != 0){
                System.out.println("Ha introducido un numero impar de participantes. ");
            } else if (numero_participantes<=2) {
                System.out.println("El numero de participantes debe ser mayor que dos");

            }


        } while (numero_participantes % 2 != 0 || numero_participantes <= 2);

        //- pedir el nombre de cada uno de los participantes

        System.out.println("Ha añadido " + numero_participantes + " para el amigo invisible. ");
        // Resto del código aquí

        String [] nombres = new String[numero_participantes];

        for (int i = 0; i < nombres.length ; i++) {

            System.out.println("Introduzca el nombre del participante");
            nombres[i] = scanner.next();

        }

        System.out.println("Estos son los participantes del amigo invisible ");
        for (String n:nombres) {
            System.out.println("-" + n);

        }

        //- sacar por pantalla el orden de las parejas resultantes

        Random random = new Random();

        for (int i = 0; i < nombres.length; i++) {

            String nombre_aleatorio;

            boolean repetido;

            do {
                nombre_aleatorio = nombres[random.nextInt(nombres.length)];
                repetido = false;

                for (int j = 0; j < i; j++) {

                    if (nombres[j].equals(nombre_aleatorio)){
                        repetido = true;
                        break;
                    }
                    
                }
            } while (repetido);

        }

        List <String> list = Arrays.asList(nombres); //randomizar
        Collections.shuffle(list);
        list.toArray(nombres);

        System.out.println("Las parejas del amigo invisible son: ");

        for (int i = 0; i < nombres.length; i += 2) {
            System.out.println(nombres[i] + " -> " + nombres[i + 1]);
        }
        
    }


    }



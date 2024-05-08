
package ejerciciolist;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();// Se declara una lista
        try (// genérica d enteros
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce valores numericos enteros (introduce -99 "
                    + "para finalizar):");

            int valor;
            while ((valor = scanner.nextInt()) != -99) {// Leer valores hasta
                // introducir -99
                numeros.add(valor);// se agregan los valores ingresados a la lista
            }
        }

        if (numeros.isEmpty()) {// Se comprueba que la lista no este vacía
            System.out.println("No se han introducido valores.");
            return;
        }

        int suma = 0;// se inicializa la variable summa para poder ir acumulando
        // (sumando) todos los valores de la lista
        for (int num : numeros) {
            suma += num;// se suman todos los números de num y se guardan
            // en la variable suma
        }
        double media = (double) suma / numeros.size();// Se realiza la operacion de la
        // media

        int mayoresQueMedia = 0;// Contador para saber que valores de la lista
        // son mayores que la media.

        System.out.println("Numeros de valores leidos: " + numeros.size());
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

        System.out.println("Valores leidos:");
        for (int num : numeros) {// Se accede a la lista por elementos y se van
            // imprimiendo
            System.out.print(num + " ");
            if (num > media) {
                mayoresQueMedia++;// se acumula el contador previamente definido
                // para saber cuátos valores cumplieron con la condición de ser
                // mayor que la media, ++(acumula de a 1)
            }
        }
        System.out.println("\nCantidad de valores mayores que la media: " +
                mayoresQueMedia);
    }

}

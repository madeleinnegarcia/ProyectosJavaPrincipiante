package calculadorsita;

public class Calculadora {

    // Método sumar para dos enteros
    public int sumar(int a, int b) {
        System.out.println("Suma de enteros: ");
        return a + b;
    }

    // Método sumar para tres enteros
    public static int sumar(int a, int b, int c) {
        System.out.println("Suma de tres enteros: ");
        return a + b + c;
    }

    // Método sumar para dos números de punto flotante
    public static double sumar(double a, double b) {
        System.out.println("Suma de numeros de punto flotante: ");
        return a + b;
    }

    // Método sumar para un array de enteros
    public static int sumar(int[] numeros) {
        System.out.println("Suma de elementos en el array: ");
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

}

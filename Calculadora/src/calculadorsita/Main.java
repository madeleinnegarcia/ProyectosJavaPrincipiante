
package calculadorsita;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora operacion1 = new Calculadora();
        System.out.println(operacion1.sumar(23, 45)); // Llama al primer método sumar
        System.out.println(Calculadora.sumar(5, 10, 15)); // Llama al segundo método sumar
        System.out.println(Calculadora.sumar(5.5, 10.5)); // Llama al tercer método sumar
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(Calculadora.sumar(nums)); // Llama al cuarto método sumar

    }

}

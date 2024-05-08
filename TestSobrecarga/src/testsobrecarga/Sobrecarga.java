
package testsobrecarga;

public class Sobrecarga {
    public void test(){
        System.out.println("Método sin argumentos");
    }
    // Sobrecarga el método test con un parámetro entero.
    public void test(int x){
        System.out.println("método con 1 argumento: ");
        System.out.println("x = " + x);
    }
    // Sobrecarga el método test con dos parámetros enteros.
    public void test(int x, int y) {
    System.out.println("método con 2 argumentos: ");
    System.out.println("x = " + x + "; y = " + y);
    }
    
    // Sobrecarga el método test con un parámetro doble.
    public double test(double x) {
    System.out.println("metodo con parametro tipo doble: " + x);
    return x * x;
    }
    
}

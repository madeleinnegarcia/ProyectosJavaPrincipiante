
package testsobrecarga;

public class TestSobrecarga {

    public static void main(String[] args) {
      
        Sobrecarga ob = new Sobrecarga();double Resultado;
        // Llama a todas las versiones del test().ob.test();
        ob.test(3);
        ob.test(34, 23);
        Resultado = ob.test(3.25);
        System.out.println("Resultado de ob.test(3.25): "+ Resultado);
    }
    
}

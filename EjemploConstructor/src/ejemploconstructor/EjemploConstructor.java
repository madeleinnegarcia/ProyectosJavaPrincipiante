package ejemploconstructor;


public class EjemploConstructor {


    public static void main(String[] args) {
        
        CuentaBancaria s= new CuentaBancaria(10000000,"María",2000000);
        long r = s.getNumero();
        System.out.println(r);
    }
    
}


package polimorfismodinamico;


public class Main {

    
    public static void main(String[] args) {
        
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 3000, 500);
        Empleado empleado2 = new EmpleadoTiempoParcial("Maria", 15, 20, 10);
        Empleado empleado3 = new Contratista("Pedro", 25, 40);

        System.out.println("Salario de " + empleado1.getNombre() + ": " + 
                empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + ": " + 
                empleado2.calcularSalario());
        System.out.println("Salario de " + empleado3.getNombre() + ": " + 
                empleado3.calcularSalario());
       
      
    }
    
    
    
}

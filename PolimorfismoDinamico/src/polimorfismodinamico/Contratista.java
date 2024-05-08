
package polimorfismodinamico;


public class Contratista extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public Contratista(String nombre, double tarifaPorHora, int horasTrabajadas) {
        super(nombre,0); // El salario base no aplica para contratistas
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        // Cálculo del salario para contratistas
        return horasTrabajadas * tarifaPorHora;
    }
    
}

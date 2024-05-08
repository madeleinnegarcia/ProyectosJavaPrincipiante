
package polimorfismodinamico;


public class EmpleadoTiempoParcial  extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    EmpleadoTiempoParcial(String nombre, double salarioBase, int horasTrabajadas, double salarioPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double calcularSalario() {
        // Cálculo del salario para empleados a tiempo parcial
        return super.calcularSalario() + (horasTrabajadas * salarioPorHora);
    }
}

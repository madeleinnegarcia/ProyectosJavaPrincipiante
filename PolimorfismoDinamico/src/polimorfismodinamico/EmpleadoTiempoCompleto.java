
package polimorfismodinamico;

public class EmpleadoTiempoCompleto extends Empleado{
    
    private double bono;
    
    EmpleadoTiempoCompleto(String nombre,double salarioBase,double  bono){
        super(nombre,salarioBase);
        this.bono=bono;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario()+ bono;
    }
    
    
}

package polimorfismodinamico;

public class Empleado {
    
    protected String nombre;
    protected double salarioBase;
    
    Empleado(String nombre,double salarioBase){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
    }
    
    public double calcularSalario(){
        return salarioBase;
    }
    public String getNombre(){
        return nombre;
    }
}   


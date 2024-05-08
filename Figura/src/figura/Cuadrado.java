/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author ASUS
 */
public class Cuadrado extends Figura{
    // Método calcularArea específico para cuadrados
    public static void calcularArea(double lado) {
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }
    
}

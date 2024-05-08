/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author ASUS
 */
public class Circulo extends Figura{
    // Método calcularArea específico para círculos
    public static void calcularArea(double radio) {
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }
    
}

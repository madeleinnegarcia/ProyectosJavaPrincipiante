/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author ASUS
 */
public class Rectangulo extends Figura {
    // Método calcularArea específico para rectángulos
    public static void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
    
}

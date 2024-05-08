
package poo;
import java.util.Locale;//Clase para establecer el idioma
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.ENGLISH);// Establecer el idioma en inglés
        //evitando tener errores, en las entradas de los datos, como por ejemplo
        //double.
        
        Scanner scanner = new Scanner(System.in);
        
        //pedir información por teclado
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        System.out.println("Introduce el sexo (H o M): ");
        char sexo = scanner.next().charAt(0); // Cambiado a next() en lugar de nextLine()
        System.out.println("Introduce el peso:");
        double peso = scanner.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();
        
        //Crear objetos de la clase Persona
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        // Tercer objeto por defecto y establecer valores con métodos set
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        
        //Mostrar información de cada objeto
        System.out.println("\n--- Persona 1 ---");
        mostrarInformacionPersona(persona1);
        System.out.println("\n--- Persona 2 ---");
        mostrarInformacionPersona(persona2);
        System.out.println("\n--- Persona 3 ---");
        mostrarInformacionPersona(persona3);    
    }
    
    private static void mostrarInformacionPersona(Persona persona) {
        int resultadoIMC= persona.calcularIMC();
        String mensajeIMC;
        //Evaluar el resultado del IMC utilizando un switch, que retorna el
        //mensaje según corresponda
        switch (resultadoIMC){
            case -1:
                mensajeIMC="En su peso ideal";
                break;
            case 0:
                mensajeIMC="Por debajo de su peso ideal";
                break;
            case 1:
                mensajeIMC="Con sobrepeso";
                break;
            default:
                mensajeIMC="No se pudo calcular IMC";
        }
        
        String mensajeMayorEdad=persona.esMayorDeEdad()? "Es mayor de edad":
                "Es menor de edad";
        System.out.println("Estado del IMC: " + mensajeIMC);
        System.out.println(mensajeMayorEdad);
        System.out.println(persona.toString());
    }
    
}

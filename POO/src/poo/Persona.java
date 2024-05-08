package poo;
import java.util.Random;// mportación de la clase Random para la generación del
//DNI
public class Persona {
    //Atributos de la clase persona
    private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    //Constantes de la clase persona
    private static final char SEXO_DEFECTO = 'H';
    private static final int PESO_IDEAL_BAJO = 0;
    private static final int PESO_IDEAL_NORMAL=-1;
    private static final int PESO_IDEAL_ALTO = 1;
    
    //Constructores de la clase persona
    
    //Constructor por defeccto
    public Persona(){
        this("",0,SEXO_DEFECTO,0,0);//llamada al constructor con parámetros
    }
    
    public Persona(String nombre,int edad,char sexo){
        this(nombre,edad,sexo,0,0);//llamada al constructor con parámetros
    }
    
    //Constructor con todos los atributos
    public Persona(String nombre, int edad, char sexo, double peso, double 
            altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        this.DNI=generaDNI();
    }
    
    //Métodos de la clase persona
    
    //Método para calcular el indice de masa corporal (IMC)
    public int calcularIMC(){
        if(peso==0.0 || altura ==0.0){
            // No se puede calcular el IMC, se asume peso ideal normal
            return PESO_IDEAL_NORMAL;
        }
        double imc=peso/(altura*altura);
        if (imc < 20){
            return PESO_IDEAL_NORMAL;
        }else if (imc >= 20 && imc <= 25){
            return PESO_IDEAL_BAJO;
        }else{
            return PESO_IDEAL_ALTO;
        }
    }
    
    //Método para determinar si la persona es mayor de edad
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    
    //Método para establecer el sexo de la persona 
    public void setSexo(char sexo){
        if(comprobarSexo(sexo)){
            this.sexo=sexo;
        }else{
            this.sexo=SEXO_DEFECTO;
        }
    }
    
    //Método privado para comprobar si el sexo es válido
    private boolean comprobarSexo(char sexo){
        return sexo == 'H' || sexo == 'M';
    }
    
    //Método Privado para generar el DNI automáticamente
    private String generaDNI(){
        Random rnd=new Random();
        int numeroDNI = rnd.nextInt(100000000);
        char letra="TRWAGMYFPDXBNJZSQVHLCKE".charAt(numeroDNI%23);
        return String.format("%08d", numeroDNI) + letra;
    }
    
    //Métodos para establecer los atributos de la persona
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    /*Al usar @override indicamos que se esta sobreescribiend el método 
    "toString()" definido en la clase "Object", que es la super clase de todas
    las clases en java. El método "toString()" se utiliza para mostrar una 
    representación de cadena de un objeto y generalmente es usado para imprimir 
    el estado del objeto. Cuándo se sobreescribe el método, en este caso se 
    podemos proporciornar nuestra propia implementación que devuelve las 
    instancias de nuestra clase*/
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura;    
    }
}

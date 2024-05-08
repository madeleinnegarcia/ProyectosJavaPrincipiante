
package polimorfismo;

import java.util.ArrayList;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Persona p1= new Persona("Ana","Garcia",27);
        
        Trabajador t1= new Trabajador("Antonio","Ramirez",26,150000);
        Trabajador t2= new Trabajador("Andres","Perez",23,15000);
        p1.mostrarInformacion();
        t1.mostrarInformacion();
        
        ArrayList<Persona> personas= new ArrayList<Persona>();
        
        personas.add(p1);
        personas.add(t1);
        personas.add(t2);
        
        /*for (int i=0; i < personas.size();i++){
            personas.get(i).mostrarInformacion();
        }*/
        
       
    }
    
}

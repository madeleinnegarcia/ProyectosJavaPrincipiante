
package tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {
    
    //Declaración de las variables estáticcas
    private static Map< String , Double > inventario= new HashMap<>();//HashMap 
    //para almacenar los productos y sus precios
    private static Scanner scanner = new Scanner(System.in);
    //Scanner para leer la entrada del usuario
    public static void main(String[] args) {
        boolean continuar =true;
        while(continuar){
            //Mostrar Menú de opciones
            System.out.println("\n1.- Introducir un producto");
            System.out.println("2.- Modificar Precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar Producto");
            System.out.println("5.- Salir");
            System.out.println("Seleccionar una opcion: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); //Limpiar el buffer del scanner
            
            switch (opcion){
                case 1:
                    //Llamar al método para introducir un producto
                    introducirProducto(); 
                    break;
                
                case 2:
                    //Llamar al método para modificar el precio un producto
                    modificarPrecioProducto();
                    break;
                case 3:
                    //Llamar al método para mostrar todos los productos
                    mostrarInventario();
                    break;
                case 4:
                    //Llamar al método para introducir un producto
                    eliminarProducto();
                    break;
                case 5:
                    //Se rompe el ciclo y se termina la ejecución.
                    continuar=false;
                    break;
                default:
                    //En tal caso de que el usuario no ingrese ninguna de las
                    //opciones
                    System.out.println("Opcion no valida"); 
            }  
        }
    }
    
    //Método para introducir un producto en el inventario
    private static void introducirProducto(){
        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        inventario.put(producto,precio);//Agregar el precio y producto al
        //inventario que es un objeto de tipo Map  
        System.out.println("Producto ingresado correctamente. ");
    }
    
    //Método para modificar el precio de un producto que existe en el inventario
    private static void modificarPrecioProducto(){
        System.out.print("Ingrese el nombre del producto que desea "
                + "modificar: ");
        String producto = scanner.nextLine();
        if(inventario.containsKey(producto)){
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio=scanner.nextDouble();
            inventario.put(producto, nuevoPrecio);// Actualizar el precio del 
            //producto en el inventario. "Put" es el método de Map que permite
            //agregar nuevos elementos a nuestro hashmap
            System.out.println("El precio del producto fue modificado "
                    + "correctamente.");
        }else{
            System.out.println("El producto especificado no existe");
        }
    
    }
    //Método para eliminar un producto que existe en el inventario
    private static void eliminarProducto(){
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String producto = scanner.nextLine();
        if (inventario.containsKey(producto)){//Se comprueba de que el producto
            //que se desea eliminar, efectivamente se encuentra en el 
            //inventario) hashmap.
            inventario.remove(producto);//Se remueve el prodcuto del inventario
            //mediante el método remove de map que remueve los elementos 
            //("llave:valor")
            System.out.println("Producto eliminado correctamente.");
        }else{
            System.out.println("El producto Especificado no existe");
        }
    }
    
    //Métodos para mostrar todos los producto e intervalos
    
    private static void mostrarInventario(){
        if (inventario.isEmpty()){//Verificar si el inventario esta vacío
            //esto se hace para evitar errores de acceso al intentar acceder a 
            //valores que no existen
            System.out.println("El inventario está vacío.");
        }else{
            System.out.println("Inventario:");
            for(Map.Entry<String, Double> entry : inventario.entrySet()){
            //Se recorre todo el inventario (hashmap), Key es la llave que
            //representa en este caso al producto  y se accede a ella con el 
            //método getKey() de maps, de igual forma, precio representa el 
            //valor de su respectiva llave(producto) y se accede con el método                        
            //de maps getValues
                System.out.println(entry.getKey() + " - Precio: " + 
                        entry.getValue());
            }
            
        }
    }
}

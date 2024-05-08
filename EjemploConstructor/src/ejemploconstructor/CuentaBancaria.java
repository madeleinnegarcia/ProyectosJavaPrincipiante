/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconstructor;


public class CuentaBancaria {
    
    private long numero;
    private String titular;
    private double saldo;
    
    //Constructor
    public CuentaBancaria(long numero,String titular,long saldo){
        this.numero=numero;
        this.saldo=saldo;
        this.titular=titular;
    }
    
    
    //get metodo para llamar a mis atributos y acceder a ellos
    public long getNumero(){
        return numero;
    }
    
    public void setNumero(long num){
        numero=num;
    }
    
    public long suma(){
        return numero;
       
    }
    
}

package Ejercicio1_Automovil;
/**
 *
 * @author Mathias Alonso
 * @version 15/08/2025
 */
public abstract class Vehiculo {
    public String marca;
    public String modelo;
    public int año;
    public int velMax;
    
    public Vehiculo(String marca, String modelo, int año, int velMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velMax = velMax;
    }
    
    public void encender(){
        System.out.println("Encendiendo vehiculo.");
    }
    
    public void apagar(){
        System.out.println("Apagando vehiculo");
    }
    
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
}

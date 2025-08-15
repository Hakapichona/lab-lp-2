/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mathias Alonso
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

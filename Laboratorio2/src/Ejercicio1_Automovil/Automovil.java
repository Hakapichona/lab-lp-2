package Ejercicio1_Automovil;
/**
 *
 * @author Mathias Alonso
 * @version 15/08/2025
 */
public class Automovil extends Vehiculo implements Transporte, IAutomovil, Comodidad{
    public String tipoCombustible;
    public int cantidadPuertas;
    public String traccion;
    
    public Automovil(String marca, String modelo, int anio, int velocidadMax,
                     String tipoCombustible, int cantidadPuertas, String traccion) {
        super(marca, modelo, anio, velocidadMax);
        this.tipoCombustible = tipoCombustible;
        this.cantidadPuertas = cantidadPuertas;
        this.traccion = traccion;
    }
    
    
    // Métodos de IAutomovil
    @Override
    public void abrirPuertas() {
        System.out.println("Puertas abiertas.");
    }

    @Override
    public void cerrarPuertas() {
        System.out.println("Puertas cerradas.");
    }

    @Override
    public void encenderLuces() {
        System.out.println("Luces encendidas.");
    }

    @Override
    public void apagarLuces() {
        System.out.println("Luces apagadas.");
    }

    // Métodos de Transporte
    @Override
    public void transportarPersonas(int cantidad) {
        System.out.println("Transportando " + cantidad + " personas.");
    }

    @Override
    public void transportarCarga(double pesoKg) {
        System.out.println("Transportando carga de " + pesoKg + " kg.");
    }

    // Métodos de Comodidad
    @Override
    public void encenderAC() {
        System.out.println("Aire acondicionado activado.");
    }

    @Override
    public void ajustarAsientos(String posicion) {
        System.out.println("Asientos ajustados a la posición: " + posicion);
    }
    
    public void abrirCapot(){
        System.out.println("Capot Abierto");
    }
    
    public void tocarBocina(){
        System.out.println("Piiiip...");
    }
}

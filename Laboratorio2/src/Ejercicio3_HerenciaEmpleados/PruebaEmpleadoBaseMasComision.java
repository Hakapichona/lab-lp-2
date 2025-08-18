package Ejercicio3_HerenciaEmpleados;
/**
 *
 * @author Nelson
 */

public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
            "Juan", "Carlos", "Perez", "1234567", 
            5000000.00, 0.05, 3000000.00);
        
        System.out.println("Información del Empleado:");
        System.out.println("---");
        System.out.println(empleado);
    }
}
package Ejercicio3_HerenciaEmpleados;
/**
 *
 * @author Nelson
 * @version 17/08/25
 */
public class PruebaEmpleadoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision(
            "Juan", "Carlos", "Perez", "1234567", 5000000.00, 0.05);
        
        System.out.println("Información del Empleado:");
        System.out.println("---");
        System.out.println(empleado);
        System.out.printf("Ingresos: %.2f%n", empleado.ingresos());
    }
}
package Ejercicio2_Empleados;
/**
 *
 * @author Matias Livio Marcelino Alfonso Benitez
 * @version 16/08/2025
 */
public class PruebaEmpleadoPorComision {
        public static void main(String[] args) {
                EmpleadoPorComision empleado=new EmpleadoPorComision("Matias","Alfonso","6882104",2.4,0.3);
                empleado.establecerVentasBrutas(3.4);//Nueva venta bruta
                System.out.println(empleado.obtenerVentasBrutas());
                empleado.establecerTarifaComision(0.5);//Nueva tarifa de comision
                System.out.println(empleado.obtenerTarifaComision());
                System.out.println(empleado);
    }
        
        
}

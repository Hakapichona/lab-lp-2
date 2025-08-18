package Ejercicio2_Empleados;
/**
 *
 * @author Matias Livio Marcelino Alfonso Benitez
 * @version 16/08/2025
 */

//
public class PruebaEmpleadoBaseMasComision {
        public static void main(String[] args) {
            EmpleadoBaseMasComision empleado1 = new EmpleadoBaseMasComision("Matias","Alfonso","6882104",2.4,0.3,25000);
            empleado1.establecerSalarioBase(27000);//Nuevo salario
            empleado1.establecerVentasBrutas(3.4);//Nueva venta bruta
            empleado1.establecerTarifaComision(0.5);//Nueva tarifa de comision
            System.out.println(empleado1);
            
    }
}

package Ejercicio1_Automovil;
/**
 *
 * @author Mathias Alonso
 * @version 15/08/2025
 */
public class AppAuto {
    public static void main(String[] args){
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 180,
                "Gasolina", 4, "Delantera");

        auto.encender();
        auto.acelerar();
        auto.transportarPersonas(4);
        auto.encenderAC();
        auto.abrirPuertas();
        auto.encenderLuces();
        auto.tocarBocina();
        auto.apagarLuces();
        auto.cerrarPuertas();
        auto.apagar();
    }
}

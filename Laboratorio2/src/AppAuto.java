/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haru
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

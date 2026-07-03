/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Football.Controlador;

import Football.Modelo.EquipoFutbol;

/**
 *
 * @author 6nycb
 */
public class Reportes {
    public static void imprimirEquipos(EquipoFutbol[] equipos) {
        if (equipos == null || equipos.length == 0) {
            System.out.println("No hay equipos registrados.");
            return;
        }
        System.out.println("=== LISTA DE EQUIPOS DE FÚTBOL ===");
        for (EquipoFutbol equipo : equipos) {
            if (equipo != null) {
                System.out.println(equipo.toString());
            }
        }
    }

    
}

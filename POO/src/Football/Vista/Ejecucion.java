/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Football.Vista;

import Football.Controlador.AdministrarEquipos;
import Football.Controlador.Reportes;
import Football.Modelo.EquipoFutbol;
import java.util.Scanner;

/**
 *
 * @author 6nycb
 */
public class Ejecucion {
    private static Scanner scanner= new Scanner(System.in);
    private static AdministrarEquipos administrador= new AdministrarEquipos(5);
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            menu();
            opcion=scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1: agregarEquipo();
                break;
                case 2:
                    verReportes();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema..");
                    break;
                default:
                    System.out.println("Opcion invalida");
            
            }
            
        }while(opcion!=3);
        scanner.close();
        
    }

        public static void menu(){
            System.out.println("\n Sistema de gestion de equipos de futbol");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Ver reportes de equipos");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
        
        }
        
        public static void agregarEquipo(){
            System.out.println("Ingrese nombre del equipo");
            String nombreEquipo = scanner.nextLine();
            
            System.out.println("Ingrese anio de creacion");
            int anioCreacion= scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Ingrese estadio");
            String estadio= scanner.nextLine();
            
            System.out.println("Ingrese entrenador");
            String entrenador= scanner.nextLine();
            
            System.out.println("Ingrese ciudad");
            String ciudad= scanner.nextLine();
            
            System.out.println("Ingrese titulos");
            int titulos= scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Ingrese division");
            String division= scanner.nextLine();
            
            System.out.println("Ingrese presidente");
            String presidente= scanner.nextLine();
            
            EquipoFutbol equipo =new EquipoFutbol(nombreEquipo,anioCreacion,estadio,
            entrenador,ciudad,titulos,division,presidente);
                administrador.agregarEquipo(equipo);
                System.out.println("Equipo agregado exitosamente");
            
        
        }
        
        public static void verReportes(){
            EquipoFutbol[] equipos=administrador.getEquipos();
            if(equipos.length==0){
                System.out.println("No hay registrados");
                return;
            }
            
            Reportes.imprimirEquipos(equipos);
        
        }
}

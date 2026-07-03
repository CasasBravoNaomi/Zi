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
public class AdministrarEquipos {
    
    private int contador;
    private final int FACTOR_AUMENTO=5;
    private EquipoFutbol[] equipos;
    
    public AdministrarEquipos(int tamano){
        this.contador=0;
        this.equipos= new EquipoFutbol[tamano];  
    }
    
    public void agregarEquipo(EquipoFutbol equipo){
        if(contador<equipos.length){
            equipos[contador]=equipo;
            contador++;
        }else{
            EquipoFutbol[] nuevoArreglo = new EquipoFutbol[equipos.length+FACTOR_AUMENTO];
            System.arraycopy(equipos,0, nuevoArreglo,0,contador);
            equipos=nuevoArreglo;
            equipos[contador]=equipo;
            contador++;
            
            
        }
    }
    
    public EquipoFutbol[] getEquipos(){
        EquipoFutbol[] resultado= new EquipoFutbol[contador];
        System.arraycopy(equipos,0,resultado,0,contador);
        return resultado;
        
    }

    
}

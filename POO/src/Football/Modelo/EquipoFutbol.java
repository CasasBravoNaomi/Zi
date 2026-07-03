/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Football.Modelo;

/**
 *
 * @author 6nycb
 */
public class EquipoFutbol {
    
    private String nombreEquipo;
    private int anioCreacion;
    private String estadio;
    private String entrenador;
    private String ciudad;
    private int titulos;
    private String division;
    private String presidente;
    
    public EquipoFutbol(String nombreEquipo,int anioCreacion,String estadio,
            String entrenador,String ciudad,int titulos,String division,String presidente){
        this.nombreEquipo=nombreEquipo;
        this.anioCreacion=anioCreacion;
        this.estadio=estadio;
        this.entrenador=entrenador;
        this.ciudad=ciudad;
        this.titulos=titulos;
        this.division=division;
        this.presidente=presidente;
    
    }
    
    @Override
    public String toString(){
        return "EquipoFutbol [Nombre: " + nombreEquipo + ", Anio: " + anioCreacion + ", Estadio: " + estadio + 
           ", Entrenador: " + entrenador + ", Ciudad: " + ciudad + ", Títulos: " + titulos + 
           ", División: " + division + ", Presidente: " + presidente + "]";
    }

    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }


    /**
     * @return the anioCreacion
     */
    public int getAnioCreacion() {
        return anioCreacion;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    /**
     * @return the entrenador
     */
    public String getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the titulos
     */
    public int getTitulos() {
        return titulos;
    }

    /**
     * @param titulos the titulos to set
     */
    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    /**
     * @return the division
     */
    public String getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * @return the presidente
     */
    public String getPresidente() {
        return presidente;
    }

    /**
     * @param presidente the presidente to set
     */
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    
}

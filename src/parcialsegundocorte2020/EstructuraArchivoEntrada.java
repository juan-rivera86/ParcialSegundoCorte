/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialsegundocorte2020;

/**
 *
 * @author Juan Rivera
 */
public class EstructuraArchivoEntrada {
    public String sexo;
    public String RangoEdad;
    public String Codigo;
    public String CodigoCiudad;
    
    public EstructuraArchivoEntrada(String sexo, String edad, String codigo, String ciudad){
        this.sexo=sexo;
        this.RangoEdad=edad;
        this.Codigo=codigo;
        this.CodigoCiudad=ciudad;
    }
    
    EstructuraArchivoEntrada(){}
}

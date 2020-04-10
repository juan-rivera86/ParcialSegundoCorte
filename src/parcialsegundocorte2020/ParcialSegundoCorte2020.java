/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialsegundocorte2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

/**
 *
 * @author Juan Rivera
 */
public class ParcialSegundoCorte2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File currentDirFile = new File(".");
        String path=System.getProperty("user.dir");
        ExtraccionArchivo archivo=new ExtraccionArchivo(path+"\\nofetal2017SinTitulos.csv");
        try{
             List<EstructuraArchivoEntrada> listadoDatos=archivo.crearListado();
             //Desarrolle su codigo a partir de este punto
             
             
             
             
             
             
             
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(ParcialSegundoCorte2020.class.getName()).log(Level.SEVERE,null,ex);
        }
       
    }
    
}

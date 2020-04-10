/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialsegundocorte2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan Rivera
 */
public class ExtraccionArchivo {
    private File archivo;
    
    ExtraccionArchivo(String path){
        this.archivo=new File(path);
    }
    
    public List<EstructuraArchivoEntrada> crearListado() throws FileNotFoundException{
         List<EstructuraArchivoEntrada> listadoFinal = new ArrayList<>();
        try (Scanner scanner = new Scanner(this.archivo);) {
            while (scanner.hasNextLine()) {
                List<String> record=getRecordFromLine(scanner.nextLine());
                EstructuraArchivoEntrada dato=new EstructuraArchivoEntrada();
                dato.sexo=(record.get(12).equals("1"))? "M":"F";
                dato.RangoEdad=record.get(14);
                dato.Codigo=record.get(54);
                dato.CodigoCiudad=record.get(0);
                listadoFinal.add(dato);
            }
        }
        return listadoFinal;
    }
    
      private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
    
    
}

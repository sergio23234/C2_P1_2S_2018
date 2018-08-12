
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class Nodo_celda {
    String nombre_cabecera;
    ArrayList<String> celdas; 
    public Nodo_celda(String nombre){
      celdas = new ArrayList();
      nombre_cabecera = nombre; 
    }
    public void add_dato(String contenido){
        celdas.add(contenido);
    }
}

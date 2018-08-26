/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class prueba {
    
    public static void main (String args[]){
     Gramatica gr = new Gramatica(System.in);
     gr.Gramatica("");
     System.out.println(gr.primero.ID+"__"+gr.primero.lista_arbol.size());
    }
}

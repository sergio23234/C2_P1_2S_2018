
import java.util.ArrayList;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergi
 */
public class Nodo_Arbol {

    String ID;
    String tipo;
    Arbol_Nogrupo Nodo_NG;
    Arbol_Grupo Nodo_Gr;
    ArrayList<Nodo_Arbol> Pila_arbol;

    public Nodo_Arbol() {
        this.Pila_arbol = new ArrayList();
        this.ID = "";
        this.tipo = "";
        this.Nodo_NG = new Arbol_Nogrupo();
        this.Nodo_Gr = new Arbol_Grupo();
    }
    
    public void Add_Nodo_Arbol(Nodo_Arbol nodo){
        Pila_arbol.add(nodo);
    }
}

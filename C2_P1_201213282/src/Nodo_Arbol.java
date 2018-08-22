
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
    
    public void Add_Nodo_Arbol(Nodo_Arbol nodo) {
        Pila_arbol.add(nodo);
    }
    
    public void set_ID(String id) {
        this.ID = id;
    }
    
    public boolean buscar_ID(String id) {
        if (this.ID.equalsIgnoreCase(ID)) {
            return true;
        } else {
            for (int i = 0; i < Pila_arbol.size(); i++) {
                Nodo_Arbol aux = Pila_arbol.get(i);
                if (aux.buscar_ID(id)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void set_tipo(String tipo) {
        this.tipo = tipo;
    }

    /*----------------------------Acciones Arbol No grupo---------------------------------------*/
    public void set_requerido() {
        
        Nodo_NG.set_requerido();
    }
    
    public boolean set_men_reque(String mensaje) {
        return Nodo_NG.set_men_reque(mensaje);
    }
    
    public void set_predeterminado(String prede) {
        Nodo_NG.set_predeterminado(prede);
    }
    
    public void set_restringir(String mensaje) {
        Nodo_NG.set_men_rest(mensaje);
    }
    
    public boolean set_men_rest(String mensaje) {
        return Nodo_NG.set_men_reque(mensaje);
    }
    
    public void Set_etiqueta(String etiqueta) {
        Nodo_NG.Set_etiqueta(etiqueta);
    }
    
    public void Set_calcular(String calcular) {
        Nodo_NG.Set_calcular(calcular);
    }
    
    public void Set_ruta(String ruta) {
        Nodo_NG.Set_ruta(ruta);
    }

//*----------------------------Acciones Arbol Grupo---------------------------------------*/
    public void set_codigoPRE(String codigo) {
        Nodo_Gr.set_codigoPRE(codigo);
    }
    
    public void set_codigoPOS(String codigo) {
        Nodo_Gr.set_codigoPOS(codigo);
    }
    
    public void set_aplicable(String apli) {
        Nodo_Gr.set_aplicable(apli);
    }
    
    public void Set_fichero(String fichero) {
        this.Nodo_Gr.Set_fichero(fichero);
    }
}

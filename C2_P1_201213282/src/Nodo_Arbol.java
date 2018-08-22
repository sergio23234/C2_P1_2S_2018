
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
    ArrayList<Nodo_Arbol> lista_arbol;
    boolean agrupacion, ciclo;

    public Nodo_Arbol() {
        this.lista_arbol = new ArrayList();
        this.ID = "";
        this.tipo = "";
        this.Nodo_NG = new Arbol_Nogrupo();
        this.Nodo_Gr = new Arbol_Grupo();
        agrupacion = ciclo = false;
    }

    public void Add_Nodo_Arbol(Nodo_Arbol nodo) {
        lista_arbol.add(nodo);
    }

    public void set_ID(String id) {
        this.ID = id;
    }

    public void set_agrupacion(boolean grupo) {
        this.agrupacion = grupo;
    }

    public void set_ciclo(boolean grupo) {
        this.ciclo = grupo;
    }

    public boolean buscar_ID(String id) {
        if (this.ID.equalsIgnoreCase(ID)) {
            return true;
        } else {
            for (int i = 0; i < lista_arbol.size(); i++) {
                Nodo_Arbol aux = lista_arbol.get(i);
                if (aux.buscar_ID(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void set_tipo(String tipo) {
        this.tipo = tipo.replace("«$", "");
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

    public void set_sugerir(String sugerir) {
        Nodo_NG.set_sugerir(sugerir);
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
        this.Nodo_Gr.Set_fichero(fichero.replace("\"", ""));
    }

    public void add_cad_min(String cad) {
        String res = Nodo_Gr.add_cad_min(cad);
        if (!res.equalsIgnoreCase("true")) {

        }
    }

    public void add_cad_max(String cad) {
        String res = Nodo_Gr.add_cad_max(cad);
        if (!res.equalsIgnoreCase("true")) {

        }
    }

    public void add_cad_fil(String cad) {
        String res = Nodo_Gr.add_cad_fil(cad);
        if (!res.equalsIgnoreCase("true")) {

        }
    }

    public void add_opc(int tipo) {
        String res = Nodo_Gr.add_opc(tipo);
        if (!res.equalsIgnoreCase("true")) {

        }
    }

    public void add_rango_min(String cad) {
        String res = Nodo_Gr.add_rango_min(cad);
        if (!res.equalsIgnoreCase("true")) {

        }
    }

    public void add_rango_max(String cad) {
        String res = Nodo_Gr.add_rango_max(cad);
        if (!res.equalsIgnoreCase("true")) {

        }
    }
}

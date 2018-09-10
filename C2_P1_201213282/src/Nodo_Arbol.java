
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
    int agrupacion, ciclo;

    public Nodo_Arbol() {
        this.lista_arbol = new ArrayList();
        this.ID = "";
        this.tipo = "";
        this.Nodo_NG = new Arbol_Nogrupo();
        this.Nodo_Gr = new Arbol_Grupo();
        agrupacion = ciclo = 0;
    }

    public void Add_Nodo_Arbol(Nodo_Arbol nodo) {
        lista_arbol.add(nodo);
    }

    public void set_ID(String id) {
        this.ID = id;
    }

    public void set_agrupacion(int grupo) {
        this.agrupacion = grupo;
    }

    public void set_ciclo(int grupo) {
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

    public int get_ciclo() {
        return this.ciclo;
    }

    public int get_agrupacion() {
        return this.agrupacion;
    }

    public int get_anidado() {
        if (ciclo == 1 || agrupacion == 1) {
            return 1;
        } else if (ciclo == 0 && agrupacion == 0) {
            return 0;
        } else {
            return -1;
        }
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

    public void Set_lectura(String lectura) {
        Nodo_NG.Set_lectura(lectura);
    }

    public void Set_multimedia(String multi) {
        Nodo_NG.Set_multimedia(multi);
    }
    public void Set_tipomultimedia(int multi) {
        Nodo_NG.Set_tipo(multi);
    }

    public void Set_automul(String multi) {
        Nodo_NG.Set_automul(multi);
    }

//*----------------------------Acciones Arbol Grupo---------------------------------------*/
    public void set_codigoPRE(String codigo) {
        Nodo_Gr.SetcodigoPRE(codigo);
    }

    public void set_codigoPOS(String codigo) {
        Nodo_Gr.SetcodigoPOS(codigo);
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

    public void add_repetir(String repetir) {
        if (ciclo == 1) {
            Nodo_Gr.add_repetir(repetir);
        } else {

        }
    }

    public void set_apariencia(String apar) {

    }

//*----------------------------Acciones de Armar Arbol---------------------------------------*/
    private String getEtiqueta() {
        if (!Nodo_NG.getEtiqueta().equals("")) {
            String respuesta = "cadena etiqueta = \"" + Nodo_NG.getEtiqueta() + "\";";
            return respuesta;
        }
        return "";
    }

    private String getrequerido() {
        if (!Nodo_NG.getRequerido().equals("falso")) {
            String respuesta = "booleano requerido = " + Nodo_NG.getRequerido() + ";";
        }
        return "";
    }

    private String getsugerencia() {
        if (!Nodo_NG.getSugerir().equals("")) {
            String respuesta = "cadena sugerencia = \"" + Nodo_NG.getSugerir() + "\";";
        }
        return "";
    }

    private String getrequeridomsn() {
        if (!Nodo_NG.getMensaje_reque().equals("")) {
            String respuesta = "cadena requeridomsn = \"" + Nodo_NG.getMensaje_reque() + "\";";
        }
        return "";
    }

    private String getrestrinmsn() {
        if (!Nodo_NG.getMensaje_restrin().equals("")) {
            String respuesta = "mensaje(\"" + Nodo_NG.getMensaje_reque() + "\");";
        }
        return "";
    }

    private String getrestringir() {
        if (!Nodo_NG.getRestringir().equals("")) {
            String respuesta = "si(" + Nodo_NG.getRestringir() + "){\r\n respuesta = param_1;\r\n }\r\n";
            return respuesta;
        }
        return "";
    }

    private String getrutamedia() {
        if (!Nodo_NG.getRuta().equals("")) {
            String respuesta = "cadena ruta =\"" + Nodo_NG.getRuta() + "\";";
            return respuesta;
        }
        return "";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Fernando
 */
public class Arbol_Grupo {

    String codigo_pre;
    String codigo_post;
    String aplicable;
    Clase_parametro parametro;
    String tipo_fichero;

    public Arbol_Grupo() {
        codigo_pre = "";
        codigo_post = "";
        aplicable = "";
        tipo_fichero = "";
        parametro = new Clase_parametro();
    }

    public void set_codigoPRE(String codigo) {
        this.codigo_pre = codigo;
    }

    public void set_codigoPOS(String codigo) {
        this.codigo_post = codigo;
    }

    public void set_aplicable(String apli) {
        this.aplicable = apli;
    }

    public void set_tipo(String fichero) {
        this.tipo_fichero = fichero;
    }

    public void Set_fichero(String fichero) {
        this.tipo_fichero = fichero;
    }

    public String add_cad_min(String cad) {
        return parametro.add_cad_min(cad);
    }

    public String add_cad_max(String cad) {
        return parametro.add_cad_max(cad);
    }

    public String add_cad_fil(String cad) {
        return parametro.add_cad_fil(cad);
    }

    public String add_opc(int tipo) {
        return parametro.add_opc(tipo);
    }

    public String add_rango_min(String cad) {
        return parametro.add_rango_min(cad);
    }

    public String add_rango_max(String cad) {
        return parametro.add_rango_max(cad);
    }

}

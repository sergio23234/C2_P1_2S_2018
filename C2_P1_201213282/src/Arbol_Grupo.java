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

    private String codigo_pre;
    private String codigo_post;
    private String aplicable;
    private Clase_parametro parametro;
    private String tipo_fichero;
    private String repetir;

    public Arbol_Grupo() {
        codigo_pre = "";
        codigo_post = "";
        aplicable = "";
        tipo_fichero = "";
        repetir = "";
        parametro = new Clase_parametro();
    }

    public void SetcodigoPRE(String codigo) {
        this.codigo_pre = codigo;
    }

    public void SetcodigoPOS(String codigo) {
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

    public String get_codigoPRE() {
        return codigo_pre;
    }

    public String get_codigoPOS() {
        return codigo_post;
    }

    public String get_aplicable() {
        return aplicable;
    }

    public String get_tipo() {
        return tipo_fichero;
    }

    public String get_fichero() {
        return tipo_fichero;
    }

    public String get_repetir() {
        return repetir;
    }

    public Clase_parametro get_parametro() {
        return this.parametro;
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

    public void add_repetir(String repetir) {
        this.repetir = repetir;
    }

}

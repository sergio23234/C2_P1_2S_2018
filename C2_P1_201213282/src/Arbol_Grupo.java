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
    Clase_parametro parametro;

    public Arbol_Grupo() {
        codigo_pre = "";
        codigo_post = "";
        parametro = new Clase_parametro();
    }

    public void set_codigoPRE(String codigo) {
        this.codigo_pre = codigo;
    }

    public void set_codigoPOS(String codigo) {
        this.codigo_post = codigo;
    }
    
}

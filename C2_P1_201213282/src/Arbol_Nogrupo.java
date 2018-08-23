/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Fernando
 */
public class Arbol_Nogrupo {

    String etiqueta;
    String requerido;
    String mensaje_reque;
    String restringir;
    String predeterminado;
    String mensaje_restrin;
    String Calcular;
    String Ruta;
    String sugerir;
    String lectura;
    public Arbol_Nogrupo() {
        etiqueta = "";
        requerido = "falso";
        mensaje_reque = "";
        restringir = "";
        predeterminado = "";
        mensaje_restrin = "";
        Calcular = "";
        Ruta = "";
        sugerir = "";
        lectura="";
    }

    public void set_requerido() {
        requerido = "verdadero";
        mensaje_reque = "Consteste la pregunta";
    }

    public boolean set_men_reque(String mensaje) {
        if (requerido.equalsIgnoreCase("falso")) {
            return false;
        } else {
            mensaje_reque = mensaje;
            return true;
        }
    }

    public void set_predeterminado(String prede) {
        this.predeterminado = prede;
    }

    public void set_sugerir(String sugerir) {
        this.sugerir = sugerir;
    }

    public void set_restringir(String mensaje) {
        this.restringir = mensaje;
    }

    public boolean set_men_rest(String mensaje) {
        if (restringir.equalsIgnoreCase("")) {
            return false;
        } else {
            this.mensaje_restrin = mensaje;
            return true;
        }
    }

    public void Set_etiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void Set_calcular(String calcular) {
        this.Calcular = calcular;
    }

    public void Set_ruta(String rut) {
        this.Ruta = rut;
    }
    
    public void Set_lectura(String rut) {
        this.lectura = rut;
    }
}

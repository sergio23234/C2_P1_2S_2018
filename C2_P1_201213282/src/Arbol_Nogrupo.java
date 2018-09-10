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

    private String etiqueta;
    private String requerido;
    private String mensaje_reque;
    private String restringir;
    private String predeterminado;
    private String mensaje_restrin;
    private String Calcular;
    private String Ruta;
    private String sugerir;
    private String lectura;
    private String auto_mult;
    private String multimedia;
    private String tipo_mul;

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
        lectura = "";
        auto_mult = "";
        multimedia = "";
        tipo_mul="";
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

    public String Set_multimedia(String multi) {
        if (multimedia.equals("")) {
            this.multimedia = multi;
            return "true";
        } else {
            return "YA EXISTE UN ARCHIVO MULTIMEDIA";
        }
    }

    public String Set_automul(String multi) {
        if (this.auto_mult.equals("")) {
            this.auto_mult = multi;
            return "true";
        } else {
            return "YA SE HA FIJADO LA REPRODUCCION";
        }
    }

    public String Set_tipo(int tipo) {
        if (!tipo_mul.equalsIgnoreCase("")) {
            switch (tipo) {
                case 0:
                    this.tipo_mul = "Imagen";
                    break;
                case 1:
                    this.tipo_mul = "Audio";
                    break;
                default:
                    this.tipo_mul = "Video";
            }
        } else {
            return "YA EXISTE UN TIPO MULTIMEDIA";
        }
        return "true";
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getRequerido() {
        return requerido;
    }

    public String getMensaje_reque() {
        return mensaje_reque;
    }

    public String getRestringir() {
        return restringir;
    }

    public String getPredeterminado() {
        return predeterminado;
    }

    public String getMensaje_restrin() {
        return mensaje_restrin;
    }

    public String getCalcular() {
        return Calcular;
    }

    public String getRuta() {
        return Ruta;
    }

    public String getSugerir() {
        return sugerir;
    }

    public String getLectura() {
        return lectura;
    }

    public String getAuto_mult() {
        return auto_mult;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public String getTipo_mul() {
        return tipo_mul;
    }

}

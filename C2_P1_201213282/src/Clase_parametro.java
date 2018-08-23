/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Fernando
 */
public class Clase_parametro {

    boolean es_rango, es_cad, es_opc = false;
    String cadenas[] = new String[3];
    String rangos[] = new String[2];
    String opciones[] = new String[2];

    public Clase_parametro() {
        es_rango = es_cad = es_opc = false;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                rangos[i] = "";
            }
            cadenas[i] = "Nada";
        }
        opciones[0] = "verdadero";
        opciones[1] = "falso";
    }

    public boolean existe() {
        if (es_rango || es_cad || es_opc) {
            return true;
        }
        return false;
    }

    public String add_cad_min(String cad) {
        if (cadenas[0].equals("Nada")) {
            cadenas[0] = cad;
            es_cad = true;
            return "true";
        } else {
            return "YA SE DECLARO OTRA CADENA MINIMA ";
        }
    }

    public String add_cad_max(String cad) {
        es_cad = true;
        if (cadenas[2].equals("Nada")) {
            cadenas[2] = cad;
            return "true";
        } else {
            return "YA SE DECLARO OTRA CADENA MAXIMA ";
        }
    }

    public String add_cad_fil(String cad) {
        es_cad = true;
        if (cadenas[1].equals("Nada")) {
            cadenas[1] = cad;
            return "true";
        } else {
            return "YA SE DECLARO OTRA CADENA FILA";
        }
    }

    public String add_opc(int tipo) {
        es_opc = true;
        if (tipo != 0) {
            rangos[0] = "Si";
            rangos[1] = "No";
        }
        return "true";
    }

    public String add_rango_min(String cad) {
        es_rango = true;
        if (rangos[0].equalsIgnoreCase("")) {
            rangos[0] = cad;
            return "true";
        }
        return "YA HAY UN RANGO MINIMO DEFINIDO";
    }

    public String add_rango_max(String cad) {
        es_rango = true;
        if (rangos[1].equalsIgnoreCase("")) {
            rangos[1] = cad;
            return "true";
        }
        return "YA HAY UN RANGO MAXIMO DEFINIDO";
    }
}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergi
 */
public class lista_celdas {

    private ArrayList<Nodo_celda> lista;
    private String matriz[] = new String[18];
    public lista_celdas() {
        lista = new ArrayList();
        llenar();
    }

    public void add_lista(String id, int num) {
        Nodo_celda aux = lista.get(num);
        aux.add_dato(id);

    }

    public int comp_lista(String id) {
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).nombre_cabecera.equalsIgnoreCase(id)) {
                lista.get(i).contador = lista.get(i).contador + 1;
                return i;
            }
        }
        return -1;
    }

    private void llenar() {
        lista.add(new Nodo_celda("tipo"));
        lista.add(new Nodo_celda("idpregunta"));
        lista.add(new Nodo_celda("etiqueta"));
        lista.add(new Nodo_celda("parametro"));
        lista.add(new Nodo_celda("calculo"));
        lista.add(new Nodo_celda("aplicable"));
        lista.add(new Nodo_celda("sugerir"));
        lista.add(new Nodo_celda("restringir"));
        lista.add(new Nodo_celda("requerido"));
        lista.add(new Nodo_celda("restringirmsn"));
        lista.add(new Nodo_celda("requeridomsn"));
        lista.add(new Nodo_celda("predeterminado"));
        lista.add(new Nodo_celda("repeticion"));
        lista.add(new Nodo_celda("apariencia"));
        lista.add(new Nodo_celda("lectura"));
        lista.add(new Nodo_celda("multimedia"));
        lista.add(new Nodo_celda("codigo_pre"));
        lista.add(new Nodo_celda("codigo_post"));
        matriz[0]="@[tipo]@";
        matriz[1]="@[idpregunta]@";
        matriz[2]="@[etiqueta]@";
        matriz[3]="@[parametro]@";
        matriz[4]="@[calculo]@";
        matriz[5]="@[aplicable]@";
        matriz[6]="@[sugerir]@";
        matriz[7]="@[restringir]@";
        matriz[8]="@[requerido]@";
        matriz[9]="@[restringirmsn]@";
        matriz[10]="@[requeridomsn]@";
        matriz[11]="@[predeterminado]@";
        matriz[12]="@[repeticion]@";
        matriz[13]="@[apariencia]@";
        matriz[14]="@[lectura]@";
        matriz[15]="@[multimedia]@";
        matriz[16]="@[codigo_pre]@";
        matriz[17]="@[codigo_post]@";
    }

    public void llenar_Vacias() {
        int llenado = 0;
        for (int i = 0; i < lista.size() && llenado == 0; i++) {
            Nodo_celda nodo = lista.get(i);
            if (nodo.dev_tam() > 0) {
                llenado = nodo.dev_tam();
            }
        }
        for (int i = 0; i < lista.size(); i++) {
            Nodo_celda nodo = lista.get(i);
            if (nodo.contador == 0) {
                for (int j = 0; j < llenado; j++) {
                    nodo.add_dato("");
                }
            }
        }
    }

    public void recorrer_lista() {
        for (Nodo_celda lista1 : lista) {
            System.out.println("-----------nombre: " + lista1.nombre_cabecera + " cantidad: " + lista1.celdas.size() + "-----------");
            for (String celda : lista1.celdas) {
                System.out.print(celda + "|");
            }
            System.out.println();
        }
    }

    public boolean repetido() {
        for (Nodo_celda lista1 : lista) {
            if (lista1.contador > 1) {
                return true;
            }
        }
        return false;
    } //hay una columna repetida
    
    public boolean minimo(){ 
        for(int i=0;i<3;i++){
            if(lista.get(i).contador==0){
                return false;
            }
        }
        return true;
    }//no tiene las 3 columnas obligatorios

    public boolean equivocada(int num){
        int contador = 0;
        for (Nodo_celda lista1 : lista) {
            if (lista1.contador > 0) {
                contador= contador+1;
            }
        }
        if(contador<num){
            return true;
        }
        return false;
    }//viene una columna equivocada
    
    public void escribir_lista(){
        FileWriter FR = null;
        BufferedWriter BR = null;
        try {
            int contador = 0;
            FR = new FileWriter("path.txt");
            BR = new BufferedWriter(FR);
            String linea="";
            contador = lista.get(0).dev_tam();
            for(int i=0;i<contador;i++){
                linea ="";
                for(int j=0;j<lista.size();j++){
                    Nodo_celda nodo=lista.get(j);
                  String es_nodo = matriz[j]+nodo.celdas.get(i)+"@[/]@\r\n";
                  linea = linea +es_nodo;
                }
                BR.write(linea);
            }
            BR.close();
        } catch (IOException e) {
            System.out.println("error en:"+e.getMessage());
        }finally {
            try {
                if (null != FR) {
                    FR.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Nodo_Arbol leer_lista(){
        Nodo_Arbol nodo = new Nodo_Arbol();
        String linea="";
        try {
            int contador = 0;
           Gramatica gr = new Gramatica(new BufferedReader(new FileReader("path.txt")));
           System.out.println("leido");
           gr.Gramatica("");
           return gr.primero;
        } catch (IOException e) {
            System.out.println("error en:"+e.getMessage());
        }
        return nodo;
    }

}

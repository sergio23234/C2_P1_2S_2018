
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
    
    public lista_celdas(){
        lista = new ArrayList();
        llenar();
    }
    public void add_lista(String id,int num){
        Nodo_celda aux = lista.get(num);
        aux.add_dato(id);
        
    }
    public int comp_lista(String id){
        for(int i=0;i<lista.size();i++){
           
            if(lista.get(i).nombre_cabecera.equalsIgnoreCase(id)){
                lista.get(i).contador =lista.get(i).contador+1; 
                System.out.println(id+"__"+i+"_"+lista.get(i).nombre_cabecera);
                return i;
            }
        }
        return -1;
    }
    public void llenar(){
        lista.add(new Nodo_celda("tipo"));
        lista.add(new Nodo_celda("idpregunta"));
        lista.add(new Nodo_celda("etiqueta"));
        lista.add(new Nodo_celda("parametro"));
        lista.add(new Nodo_celda("calculo"));
        lista.add(new Nodo_celda("aplicable"));
        lista.add(new Nodo_celda("sugerir"));
        lista.add(new Nodo_celda("restringir"));
        lista.add(new Nodo_celda("restringirmsn"));
        lista.add(new Nodo_celda("requeridomsn"));
        lista.add(new Nodo_celda("requerido"));
        lista.add(new Nodo_celda("predeterminado"));
        lista.add(new Nodo_celda("repeticion"));
        lista.add(new Nodo_celda("apariencia"));
        lista.add(new Nodo_celda("codigo_pre"));
        lista.add(new Nodo_celda("codigo_post"));
    }
        public void recorrer_lista(){
        for (Nodo_celda lista1 : lista) {
           System.out.println("-----------nombre: "+lista1.nombre_cabecera+" cantidad: "+lista1.celdas.size()+"-----------");
           for(String celda:lista1.celdas){
               System.out.print(celda+"|");
           }
          System.out.println();
        }
    }
}

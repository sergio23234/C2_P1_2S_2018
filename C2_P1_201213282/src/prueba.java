/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class prueba {

    public static void main(String args[]) {
        Gramatica gr = new Gramatica(System.in);
        gr.Gramatica("");
        prueba p = new prueba();
        p.recorrer_raiz("Sin padre",gr.primero);
    }

    public void recorrer_raiz(String padre,Nodo_Arbol primero) {
        System.out.println(padre+"---->"+primero.ID + "__" + primero.lista_arbol.size());
        if (primero.lista_arbol.size() > 0) {
            for (int i = 0; i < primero.lista_arbol.size(); i++) {
                recorrer_raiz(primero.ID,primero.lista_arbol.get(i));
            }
        }
    }
}

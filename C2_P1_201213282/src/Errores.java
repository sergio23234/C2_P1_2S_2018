/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergi
 */
public class Errores {
 int linea;
 int columna;
 String token_es;
 String token_en;
 public Errores(int linea,int columna,String encontrado,String esperado){
     this.linea = linea;
     this.columna = columna;
     this.token_en = encontrado;
     this.token_es = esperado;
 }
 public String dev_error(){
     String retorno = "Error en Linea: "+linea+" Columna: "+columna+" Se esperaba: "+token_es+" pero se encontro: "+token_en;
     return retorno;
 }
 
}

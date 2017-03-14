/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Fami Lòpez Carreño
 */
public class Ahorcado {
    String palabra[];
    String palabraJugador[];
    String letra;
    int tamaño;
    int oportunidades;

    public Ahorcado() {
        this.palabra = new String[]{"i","n","t","e","r","e","s","a","n","t","e"};
        this.palabraJugador = new String[]{"-","-","-","-","-","-","-","-","-","-","-"};
        this.oportunidades = 7; 
    }
    
    int verificarLetra(){
        int cont = 0;
        for(int i=0; i<11; i++){
            if (this.palabra[i].equals(this.letra)){
                this.palabraJugador[i] = this.letra;
                cont += 1;
            } 
        }
        
        if(cont!=0){
            return 1;
        }else{
            return 0;
        }
    }
    
    int verificarPalabra(){
        int cont = 0;
        for(int i=0; i<11; i++){
            if (palabra[i].equals(palabraJugador[i])){
                cont += 1;   
            }
        }
        
        if(cont == 11){
            return 1;
        }else{
            return 0;
        }
    }
    
    int mostrarJuego(){
        if (this.verificarLetra()==0){
            this.oportunidades -= 1;
        }
        
        for(int i=0; i<11; i++){
            System.out.print(this.palabraJugador[i]+" ");
        }
        
        return this.oportunidades;
    }
}

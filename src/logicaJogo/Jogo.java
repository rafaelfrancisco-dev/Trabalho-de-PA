/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJogo;

/**
 *
 * @author Rafael
 */
public class Jogo {
    Mapa map;
    
    public Jogo(){
        map = new Mapa();
    }
    
    public void imprimirMapa(){
        map.imprimirMapa();
    }
}
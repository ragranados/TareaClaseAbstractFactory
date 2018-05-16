/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos.Orcos;

import abstractfactoryreinos.Elfos.*;
import abstractfactoryreinos.AbstractFactory;
import abstractfactoryreinos.Orcos.Orco;

/**
 *
 * @author rau3
 */
public class CuartelOrcos implements AbstractFactory{

    @Override
    public Orco crearOrco(String tipo) {
        switch(tipo){
            case "Hechicero":
                return new Hechicero();
                
            case "Lanzador":
                return new Lanzador();
                
            case "BestiaMayor":
                return new BestiaMayor();
                
        }
        return null;
    }

    @Override
    public Elfo crearElfo(String tipo) {
        return null;
    }
    
    
}

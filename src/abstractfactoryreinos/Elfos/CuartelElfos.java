/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos.Elfos;

import abstractfactoryreinos.AbstractFactory;
import abstractfactoryreinos.Orcos.Orco;

/**
 *
 * @author rau3
 */
public class CuartelElfos implements AbstractFactory{

    @Override
    public Elfo crearElfo(String tipo) {
        switch(tipo){
            case "Mago":
                return new Mago();
                
            case "Arquero":
                return new Arquero();
                
            case "ReyElfo":
                return new ReyElfo();
                
        }
        return null;
    }

    @Override
    public Orco crearOrco(String tipo) {
        return null;
    }
    
    
}

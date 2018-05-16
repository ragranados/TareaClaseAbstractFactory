/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos;

import abstractfactoryreinos.Elfos.CuartelElfos;
import abstractfactoryreinos.Orcos.CuartelOrcos;

/**
 *
 * @author rau3
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String tipo){
        switch(tipo){
            case "Orcos":
                return new CuartelOrcos();
            
            case "Elfos":
                return new CuartelElfos();
            
        }
        return null;
    }
    
}

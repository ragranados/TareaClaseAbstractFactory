/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos;

import abstractfactoryreinos.Elfos.Elfo;
import abstractfactoryreinos.Orcos.Orco;

/**
 *
 * @author rau3
 */
public interface AbstractFactory {
    Elfo crearElfo(String tipo);
    Orco crearOrco(String tipo);
    
}

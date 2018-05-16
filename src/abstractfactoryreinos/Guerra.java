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
public class Guerra {
    public static void main(String[] args) {
        AbstractFactory guerra;
        
        guerra = FactoryProducer.getFactory("Orcos");
        Orco orco1 = guerra.crearOrco("Lanzador");
        orco1.perseguir();
        orco1.sonidoDeGuerra();
        Orco orco2 = guerra.crearOrco("Lanzador");
        orco2.retirarse();
        Orco orco3 = guerra.crearOrco("Hechicero");
        orco3.perseguir();
        Orco orco4 = guerra.crearOrco("Hechicero");
        orco4.perseguir();
        Orco orco5 = guerra.crearOrco("BestiaMayor");
        orco5.sonidoDeGuerra();
        
        guerra = FactoryProducer.getFactory("Elfos");
        Elfo elfo1 = guerra.crearElfo("Arquero");
        Elfo elfo2 = guerra.crearElfo("Arquero");
        Elfo elfo3 = guerra.crearElfo("Mago");
        Elfo elfo4 = guerra.crearElfo("Mago");
        Elfo elfo5 = guerra.crearElfo("ReyElfo");
        elfo1.morir();
        elfo2.morir();
        elfo3.morir();
        elfo4.morir();
        elfo5.morir();
        
        
        
        
       
    }
    
}

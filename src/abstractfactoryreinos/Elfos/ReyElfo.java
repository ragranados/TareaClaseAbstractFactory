/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos.Elfos;

/**
 *
 * @author rau3
 */
public class ReyElfo implements Elfo{

    @Override
    public void gritoDeGuerra() {
        System.out.println("AHHHHG SOY EL REY ");
    }

    @Override
    public void morir() {
        System.out.println("Adios :'v");
    }

    @Override
    public void atacar() {
        System.out.println("ataquen subditos >:v >:v");
    }
    
    
}

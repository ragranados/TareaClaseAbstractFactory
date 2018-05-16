/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryreinos.Orcos;

/**
 *
 * @author rau3
 */
public class Hechicero implements Orco{

    @Override
    public void sonidoDeGuerra() {
        System.out.println("RAAAHHGG >:v");
    }

    @Override
    public void retirarse() {
        System.out.println("fuimonos :'v");
    }

    @Override
    public void perseguir() {
        System.out.println("Ya casi te alcanzo y te tiro hechizo");
    }
    
}

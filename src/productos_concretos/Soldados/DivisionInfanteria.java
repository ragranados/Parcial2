/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_concretos.Soldados;

import productos_abstractos.Division;

/**
 *
 * @author rau3
 */
public class DivisionInfanteria implements Division{
    int vida,danio;
    int espera;

    public DivisionInfanteria() {
        this.vida = vida;
        this.danio = danio;
        this.espera = espera;
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

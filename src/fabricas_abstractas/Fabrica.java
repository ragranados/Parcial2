/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import enumeraciones.Aviones;
import enumeraciones.Divisiones;
import enumeraciones.Edificaciones;
import enumeraciones.Tanques;
import java.util.ArrayList;
import productos_abstractos.Avion;
import productos_abstractos.Division;
import productos_abstractos.Tanque;

/**
 *
 * @author rau3
 */
public interface Fabrica {
    int getHangerSize();
    Edificaciones getTipoEdificacion();
    ArrayList<Avion> getHangar();
    ArrayList<Tanque> getHangarTanques();
    ArrayList<Division> getCuartel();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import Bandos.CentroDeMando;
import enumeraciones.Edificaciones;

/**
 *
 * @author rau3
 */
public interface Recursos {
    void crearRecursos(CentroDeMando c);
    void setProduccion(int p);
    Edificaciones getTipoEdificacion();
    
}

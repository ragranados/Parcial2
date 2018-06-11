/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import enumeraciones.Edificaciones;

/**
 *
 * @author rau3
 */
public interface Recursos {
    void crearRecursos(int a);
    void setProduccion(int p);
    Edificaciones getTipoEdificacion();
    
}

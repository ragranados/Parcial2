/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;



import enumeraciones.*;
import productos_abstractos.*;

/**
 *
 * @author rau3
 */
public interface AbstractFactory {
    Edificaciones getTipoEdificacion();
    Tanque crearTanque(Tanques tipo) throws Exception;
    Avion crearAvion(Aviones tipo) throws Exception;
    Division entrenarSoldados(Divisiones tipo) throws Exception;
    int getVida();
    void setVida(int vida);
    void setFaseCreacion(int a);
}

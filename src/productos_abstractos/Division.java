/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_abstractos;

/**
 *
 * @author rau3
 */
public interface Division {
    void atacar();
    void morir();
    void setObjetivo(Unidad unidad);
    Unidad getObjetivo();
    void setVida(int a);
}

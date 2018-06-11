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
public interface Unidad {
    int getVida();
    void setVida(int vida);
    int getFaseCreacion();
    int getEspera();
    Unidad getObjetivo();
    void setFaseCreacion(int a);
    void atacar();
}

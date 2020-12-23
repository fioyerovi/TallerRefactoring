/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author El Pitagoras
 */
public class CalificacionMaterial {
    private Paralelo paralelo;
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;

    public CalificacionMaterial(Paralelo paralelo, double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.paralelo = paralelo;
        this.nexamen = nexamen;
        this.ndeberes = ndeberes;
        this.nlecciones = nlecciones;
        this.ntalleres = ntalleres;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public double getNexamen() {
        return nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }
    
}

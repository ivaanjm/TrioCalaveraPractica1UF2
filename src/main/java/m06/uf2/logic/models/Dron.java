/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Dron extends Autonoma {

    @Column
    private Integer alturaMax; // Altura máxima donde el dron puede llegar a volar.
    @Column
    private Integer distanciaMax; // Distáncia máxima donde el dron puede llegar.

    public Dron(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Dron(Integer alturaMax, Integer distanciaMax, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.alturaMax = alturaMax;
        this.distanciaMax = distanciaMax;
    }

    public Dron(Integer alturaMax, Integer distanciaMax, Integer velocidadMax, Integer KmAutonomia, int id, String nomAeronau, String tipo) {
        super(velocidadMax, KmAutonomia, id, nomAeronau, tipo);
        this.alturaMax = alturaMax;
        this.distanciaMax = distanciaMax;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }

    public Integer getDistanciaMax() {
        return distanciaMax;
    }

    public void setDistanciaMax(Integer distanciaMax) {
        this.distanciaMax = distanciaMax;
    }
}

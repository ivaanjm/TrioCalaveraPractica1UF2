/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author mitra
 */
@Entity
public abstract class Autonoma extends Aeronau {

    @Column
    private Integer velocidadMax;
    @Column
    private Integer KmAutonomia;

    public Autonoma(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Autonoma(Integer velocidadMax, Integer KmAutonomia, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.velocidadMax = velocidadMax;
        this.KmAutonomia = KmAutonomia;
    }

    
    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Integer getKmAutonomia() {
        return KmAutonomia;
    }

    public void setKmAutonomia(Integer KmAutonomia) {
        this.KmAutonomia = KmAutonomia;
    }

}

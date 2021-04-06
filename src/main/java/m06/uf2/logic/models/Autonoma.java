/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

/**
 *
 * @author mitra
 */
public abstract class Autonoma extends Aeronau {

    private Integer velocidadMax;
    private Integer KmAutonomia;

    public Autonoma(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Autonoma(Integer velocidadMax, Integer KmAutonomia, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
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

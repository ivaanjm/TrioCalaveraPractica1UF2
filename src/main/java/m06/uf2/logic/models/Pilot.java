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

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Pilot extends Soldat {

    @OneToOne(targetEntity = Pilotada.class)
    private Pilotada pilotada;


    public Pilot(Integer id, String rango, String nombre, String apellido, String esp) {
        super(id, rango, nombre, apellido, esp);
    }

    public Pilot(Pilotada pilotada, Integer id, String rango, String nombre, String apellido, String esp) {
        super(id, rango, nombre, apellido, esp);
        this.pilotada = pilotada;
    }

    public Pilotada getPilotada() {
        return pilotada;
    }

    public void setPilotada(Pilotada pilotada) {
        this.pilotada = pilotada;
    }

}

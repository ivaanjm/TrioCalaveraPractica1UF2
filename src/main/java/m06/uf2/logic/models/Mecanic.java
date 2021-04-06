/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author mitra
 */
@Entity
public class Mecanic extends Soldat {

    @OneToOne(cascade = {CascadeType.ALL})
    private Pilotada pilotada;

    public Mecanic(Pilotada pilotada, Integer id, String rango, String nombre, String apellido, String esp) {
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

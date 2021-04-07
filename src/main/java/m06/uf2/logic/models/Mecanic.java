/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mitra
 */
@Entity
@Table
public class Mecanic extends Soldat {

    @OneToOne(cascade = {CascadeType.ALL})
    private Pilotada pilotada; // se añade una nave a mecanico

    public Mecanic(Integer id, String rango, String nombre, String apellido, String esp) {
        super(id, rango, nombre, apellido, esp);
    }

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

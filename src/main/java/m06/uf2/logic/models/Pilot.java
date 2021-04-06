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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Pilot extends Soldat {


    @OneToOne
    private Pilotada pilotada;

    public Pilot(Integer id, String rango, String nombre, String apellido, String esp) {
        super(id, rango, nombre, apellido, esp);
    }

    public Pilot( Pilotada pilotada, Integer id, String rango, String nombre, String apellido, String esp) {
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

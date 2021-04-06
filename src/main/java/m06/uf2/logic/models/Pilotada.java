/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pilotada extends Aeronau {

    @OneToOne
    private Pilot piloto;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "pilotada_id")
    private List<Mecanic> mecanic = new ArrayList<>();

    public Pilotada(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Pilotada(Pilot piloto, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.piloto = piloto;
    }



    public Pilot getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilot piloto) {
        this.piloto = piloto;
    }

    public List<Mecanic> getMecanic() {
        return mecanic;
    }

    public void setMecanic(List<Mecanic> mecanic) {
        this.mecanic = mecanic;
    }
    
}

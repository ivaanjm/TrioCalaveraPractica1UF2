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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pilotada extends Aeronau {

    
    @OneToOne(targetEntity = Pilot.class, cascade = CascadeType.ALL)
    private Pilot PilotAeronau; // Relacion 1 - 1 a pilot

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "pilotada_id")
    private List<Mecanic> Mecanics ; // Relacion 1 - n a Mecanic

    public Pilotada(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Pilotada(Pilot PilotAeronau, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.PilotAeronau = PilotAeronau;
    }

    public Pilot getPilotAeronau() {
        return PilotAeronau;
    }

    public void setPilotAeronau(Pilot PilotAeronau) {
        this.PilotAeronau = PilotAeronau;
    }

    public List<Mecanic> getMecanics() {
        return Mecanics;
    }

    public void setMecanics(List<Mecanic> Mecanic) {
        this.Mecanics = Mecanic;
    }




   
 
}

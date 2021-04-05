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

public class Pilot extends Soldat {


    @Column
    private String nom;
    @Column
    private String apellido;
    @OneToOne
    private Pilotada pilotada;

    public Pilot(Integer id, String rango) {
        super(id, rango);
    }

    public Pilot(String nom, String apellido, Pilotada pilotada, Integer id, String rango) {
        super(id, rango);
        this.nom = nom;
        this.apellido = apellido;
        this.pilotada = pilotada;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Pilotada getPilotada() {
        return pilotada;
    }

    public void setPilotada(Pilotada pilotada) {
        this.pilotada = pilotada;
    }

    
}

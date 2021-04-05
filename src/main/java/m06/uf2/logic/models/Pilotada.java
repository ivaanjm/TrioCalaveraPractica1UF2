/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public abstract class Pilotada extends Aeronau {

    private String dni;
    private String nom;
    private String pCognom;

    @OneToOne
    private Pilot piloto;
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "pilotadaid_id")
    private List<Mecanic> mecanic = new ArrayList<>();

    public Pilotada(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Pilotada(String dni, String nom, String pCognom, Pilot piloto, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
        this.dni = dni;
        this.nom = nom;
        this.pCognom = pCognom;
        this.piloto = piloto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getpCognom() {
        return pCognom;
    }

    public void setpCognom(String pCognom) {
        this.pCognom = pCognom;
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

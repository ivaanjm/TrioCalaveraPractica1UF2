/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Aeronau {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id; // Identificador único
    @Column
    private String nomAeronau; // Nombre del aeronave
    @Column
    private String tipo; // Tipo de aeronave: Transport, Dron o Combat
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Missio> Missions = new ArrayList<>(); // Lista que contiene las missiones
    
    
    public Aeronau(int id, String nomAeronau, String tipo) {
        this.id = id;
        this.nomAeronau = nomAeronau;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomAeronau() {
        return nomAeronau;
    }

    public void setNomAeronau(String nomAeronau) {
        this.nomAeronau = nomAeronau;
    }

    public List<Missio> getMissions() {
        return Missions;
    }

    public void setMissions(List<Missio> Missions) {
        this.Missions = Missions;
    }


    @Override
    public String toString() {
        return "Aeronau{" + "id=" + id + ", nomAeronau=" + nomAeronau + ", tipo=" + tipo + ", misiones=" + Missions + '}';
    }

}

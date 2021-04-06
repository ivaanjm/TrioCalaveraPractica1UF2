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
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Aeronau {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String nomAeronau;
    @Column
    private String tipo;


    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Missio> misiones = new ArrayList<>();
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
    public List<Missio> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Missio> misiones) {
        this.misiones = misiones;
    }

}

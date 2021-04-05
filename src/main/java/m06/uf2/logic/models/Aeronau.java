/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public abstract class Aeronau {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomAeronau;
    private int seients;
    
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Missio> misiones = new ArrayList<>();

    public Aeronau(int id, String nomAeronau, int seients) {
        this.id = id;
        this.nomAeronau = nomAeronau;
        this.seients = seients;
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

    public int getSeients() {
        return seients;
    }

    public void setSeients(int seients) {
        this.seients = seients;
    }

    public List<Missio> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Missio> misiones) {
        this.misiones = misiones;
    }
    

}

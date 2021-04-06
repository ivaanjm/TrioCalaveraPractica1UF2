
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author mitra
 */
@Entity
public class Missio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private String destino;
    @Column
    private Date fecha;
    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "misiones")
    private List<Aeronau> Aeronaus = new ArrayList<>();

    public Missio(int id, String nombre, String destino, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Aeronau> getAeronaus() {
        return Aeronaus;
    }

    public void setAeronaus(List<Aeronau> Aeronaus) {
        this.Aeronaus = Aeronaus;
    }

}

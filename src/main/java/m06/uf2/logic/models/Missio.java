
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
import javax.persistence.ManyToMany;

/**
 *
 * @author mitra
 */
public class Missio {
    
    private int id;
    private String nombre;
    private String destino;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

/**
 *
 * @author mitra
 */
public class Mecanic extends Soldat {

    private String nombre;
    private String Apellido;
    
    @OneToOne(cascade = {CascadeType.ALL})
    private Pilotada pilotada;

    public Mecanic(Integer id, String rango) {
        super(id, rango);
    }

    public Mecanic(String nombre, String Apellido, Pilotada pilotada, Integer id, String rango) {
        super(id, rango);
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.pilotada = pilotada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Pilotada getPilotada() {
        return pilotada;
    }

    public void setPilotada(Pilotada pilotada) {
        this.pilotada = pilotada;
    }

}

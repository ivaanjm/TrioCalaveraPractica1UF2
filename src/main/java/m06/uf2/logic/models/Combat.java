/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author mitra
 */
@Entity
@Table
public class Combat extends Pilotada {

    @Column
    private String Arma; // Tipo de arma que llevara la aeronave
    @Column
    private String nombre; // Nombre del arma

    public Combat(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Combat(String Arma, String nombre, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.Arma = Arma;
        this.nombre = nombre;
    }

    public Combat(String Arma, String nombre, Pilot piloto, int id, String nomAeronau, String tipo) {
        super(piloto, id, nomAeronau, tipo);
        this.Arma = Arma;
        this.nombre = nombre;
    }

    public String getArma() {
        return Arma;
    }

    public void setArma(String Arma) {
        this.Arma = Arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

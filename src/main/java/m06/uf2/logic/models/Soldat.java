/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author mitra
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Soldat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String rango;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String esp;// Especialización

    public Soldat(Integer id, String rango, String nombre, String apellido, String esp) {
        this.id = id;
        this.rango = rango;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esp = esp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    @Override
    public String toString() {
        return "Soldat{" + "id=" + id + ", rango=" + rango + ", nombre=" + nombre + ", apellido=" + apellido + ", esp=" + esp + '}';
    }


}

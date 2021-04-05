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
public class Combat extends Pilotada{

    private String tipo;
    private String nombre;
    
    
    public Combat(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Combat(String tipo, String nombre, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Combat(String tipo, String nombre, String dni, String nom, String pCognom, Pilot piloto, int id, String nomAeronau, int seients) {
        super(dni, nom, pCognom, piloto, id, nomAeronau, seients);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
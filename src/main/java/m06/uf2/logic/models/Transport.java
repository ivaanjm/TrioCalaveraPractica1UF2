/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Transport extends Pilotada {

    @Column
    private String carga; // Tipo de carga que lleva la aeronave
    @Column
    private String distanciaDestino; // Distancia en KM del origen al destino

    public Transport(int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
    }

    public Transport(String carga, String distanciaDestino, int id, String nomAeronau, String tipo) {
        super(id, nomAeronau, tipo);
        this.carga = carga;
        this.distanciaDestino = distanciaDestino;
    }

    public Transport(String carga, String distanciaDestino, Pilot piloto, int id, String nomAeronau, String tipo) {
        super(piloto, id, nomAeronau, tipo);
        this.carga = carga;
        this.distanciaDestino = distanciaDestino;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(String distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

  

}

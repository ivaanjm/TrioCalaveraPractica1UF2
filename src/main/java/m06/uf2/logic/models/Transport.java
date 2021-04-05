/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;


public class Transport extends Pilotada{
    private String carga;
    private String distancia;

    public Transport(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Transport(String carga, String distancia, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
        this.carga = carga;
        this.distancia = distancia;
    }

    public Transport(String carga, String distancia, String dni, String nom, String pCognom, Pilot piloto, int id, String nomAeronau, int seients) {
        super(dni, nom, pCognom, piloto, id, nomAeronau, seients);
        this.carga = carga;
        this.distancia = distancia;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    
   
}

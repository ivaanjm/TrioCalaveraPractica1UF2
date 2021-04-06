/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;


public class Dron extends Autonoma{
    
  private  Integer alturaMax;
  private Integer distanciaMax;

    public Dron(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Dron(Integer alturaMax, Integer distanciaMax, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
        this.alturaMax = alturaMax;
        this.distanciaMax = distanciaMax;
    }

    public Dron(Integer alturaMax, Integer distanciaMax, Integer velocidadMax, Integer KmAutonomia, int id, String nomAeronau, int seients) {
        super(velocidadMax, KmAutonomia, id, nomAeronau, seients);
        this.alturaMax = alturaMax;
        this.distanciaMax = distanciaMax;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }

    public Integer getDistanciaMax() {
        return distanciaMax;
    }

    public void setDistanciaMax(Integer distanciaMax) {
        this.distanciaMax = distanciaMax;
    }    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;


public class Dron extends Autonoma{
    
  private  boolean isCom;
  private boolean isEspia;

    public Dron(int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
    }

    public Dron(boolean isDron, boolean isEspia, int id, String nomAeronau, int seients) {
        super(id, nomAeronau, seients);
        this.isDron = isDron;
        this.isEspia = isEspia;
    }

    public Dron(boolean isDron, boolean isEspia, boolean isAutonoma, Integer KmAutonomia, int id, String nomAeronau, int seients) {
        super(isAutonoma, KmAutonomia, id, nomAeronau, seients);
        this.isDron = isDron;
        this.isEspia = isEspia;
    }

    public boolean isIsDron() {
        return isDron;
    }

    public void setIsDron(boolean isDron) {
        this.isDron = isDron;
    }

    public boolean isIsEspia() {
        return isEspia;
    }

    public void setIsEspia(boolean isEspia) {
        this.isEspia = isEspia;
    }
    

    
}
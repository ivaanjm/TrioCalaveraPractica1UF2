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
public class Pilot {
    
    private String DNIPilot;
    private String nomPilot;
    private String cognomPilot;
    private int edadPilot;

    public String getDNIPilot() {
        return DNIPilot;
    }

    public void setDNIPilot(String DNIPilot) {
        this.DNIPilot = DNIPilot;
    }

    public String getNomPilot() {
        return nomPilot;
    }

    public void setNomPilot(String nomPilot) {
        this.nomPilot = nomPilot;
    }

    public String getCognomPilot() {
        return cognomPilot;
    }

    public void setCognomPilot(String cognomPilot) {
        this.cognomPilot = cognomPilot;
    }

    public int getEdadPilot() {
        return edadPilot;
    }

    public void setEdadPilot(int edadPilot) {
        this.edadPilot = edadPilot;
    }
    
}

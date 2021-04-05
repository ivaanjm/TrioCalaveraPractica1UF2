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
public class Soldat {
    
    private String DNISoldat;

    public String getDNISoldat() {
        return DNISoldat;
    }

    public void setDNISoldat(String DNISoldat) {
        this.DNISoldat = DNISoldat;
    }

    public String getNomSoldat() {
        return nomSoldat;
    }

    public void setNomSoldat(String nomSoldat) {
        this.nomSoldat = nomSoldat;
    }

    public String getCognomSoldat() {
        return cognomSoldat;
    }

    public void setCognomSoldat(String cognomSoldat) {
        this.cognomSoldat = cognomSoldat;
    }

    public String getRangSoldat() {
        return rangSoldat;
    }

    public void setRangSoldat(String rangSoldat) {
        this.rangSoldat = rangSoldat;
    }
    private String nomSoldat;
    private String cognomSoldat;
    private String rangSoldat;
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.models;


    
  public class Pilotada extends Aeronau{
    
    private String dni;
    private String nom;
    private String pCognom;

    public Pilotada(String nom, String pCognom) {
        this.nom = nom;
        this.pCognom = pCognom;
    }

    public Pilotada(String nom, String pCognom, String nomAeronau, int seients) {
        super(nomAeronau, seients);
        this.nom = nom;
        this.pCognom = pCognom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getpCognom() {
        return pCognom;
    }

    public void setpCognom(String pCognom) {
        this.pCognom = pCognom;
    }
    
    
}
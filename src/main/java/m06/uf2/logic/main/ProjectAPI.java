/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import m06.uf2.logic.models.Combat;
import m06.uf2.logic.models.Transport;
import m06.uf2.logic.models.Mecanic;
import m06.uf2.logic.models.Soldat;
import m06.uf2.logic.models.Missio;
import m06.uf2.logic.models.Pilot;
import m06.uf2.logic.models.Dron;
import m06.uf2.logic.models.Aeronau;
import m06.uf2.logic.models.Pilotada;

/**
 *
 * @author manel
 */
public class ProjectAPI {
    
    /**
     * Afegeix mecanics a aeronau pilotada
     * @param lo LLista dels mecanics
     * @param p Aeronau
     * @return 
     */
    public static Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p)
    {
                         
        return p;
    }
    
    /**
     * Afegeix missions a Aeronau
     * @param lm
     * @param a Aeronau
     * @return 
     */
    public static Aeronau addMissionsToAeronau(List<Missio> lm, Aeronau a)
    {
      
             
        return a;
    }
    
    /**
     * Afegeix pilot a aeronau pilotada
     * @param p aeronau
     * @param a
     * @return 
     */
    public static Aeronau addPilotToAeronauPilotada(Pilot p, Pilotada a)
    {
               
        return a;
    }
    
    /**
     * Retorna una instancia del tipus demanat amb dades ficticies
     * Exemple d'utilització:
     *   Pilotada p = (Pilotada)ProjectAPI.aeronauFactory(Combat.class);
     * @param tipus (Dron, Transport, Combat)
     * @return 
     */
    public static Aeronau aeronauFactory(Class<?> tipus)
    {
                         
        return ret;    
    }
    
   
    /**
     * REtorna una llista de l'entitat demanada amb dades ficticies
     * @param elements quantitat d'elements a retornar
     * @return 
     */
    public static List<Soldat> mecanicsFactory(int elements)
    {
                         
        return ret;    
    }
    
    /**
     * Retorna una llista de pilots amb dades ficticies
     * @param elements quantitat d'elements a retornar
     * @return 
     */
    public static List<Soldat> pilotsFactory(int elements)
    {
        
                        
        return ret;    
    }
    
     /**
     * Retorna una llista de missions amb dades ficticies
     * @param elements quantitat d'elements a retornar
     * @return 
     */
    public static List<Missio> missionsFactory(int elements)
    {
       
                        
        return ret;    
    }
    
    /**
     * Crea una instancia de Mecanic o Pilot segons el paràmetre subministrat
     * @param tipus (macanic o pilot)
     * @return 
     */
    public static Soldat soldatFactory(Class<?> tipus)
    {    
        
                         
        return ret;    
    }
    
    /**
     * Retorna una instancia de missio amb dades ficticies
     * @return 
     */
    public static Missio missioFactory()
    {
                      
        return ret;
        
    }
    
}

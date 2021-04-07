/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;
import m06.uf2.logic.models.Pilot;
import m06.uf2.logic.models.Soldat;
import m06.uf2.logic.models.Mecanic;

import java.lang.Class;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import m06.uf2.logic.models.Combat;
import m06.uf2.logic.models.Missio;
import m06.uf2.logic.models.Pilotada;
import m06.uf2.logic.models.Transport;
import org.hibernate.Session;

/**
 *
 * @author arsenbasha
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Faker f = new Faker();
        List<Missio> ret = ProjectAPI.missionsFactory(20);
        for (Missio missio : ret) {
            System.out.println(missio.toString());
        }
      
       
      
       
       
       
//        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
//        Session session = SingleSession.getSesio();
//        session.beginTransaction();
//        Pilot p = new Pilot(0, Utils.randomRango(), f.name().firstName(), f.name().fullName(), "piloto");
//        Combat ap =new Combat("cscs", "csdcsd", 0, "dcs", "dw");
//        ProjectAPI.addPilotToAeronauPilotada(p, ap);
//        session.save(p);
//        session.save(ap);
//        session.getTransaction().commit();
//        session.close();
        // System.out.println(soldat.getApellido());
        System.out.println("Final ");
    }
}

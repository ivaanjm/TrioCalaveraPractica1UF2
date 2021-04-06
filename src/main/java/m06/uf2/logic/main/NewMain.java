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
import java.util.logging.Level;
import m06.uf2.logic.models.Combat;
import m06.uf2.logic.models.Pilotada;
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

//        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
//        Session session = SingleSession.getSesio();
//        session.beginTransaction();
        //  Soldat soldat= ProjectAPI.soldatFactory(Mecanic.class);
        // System.out.println(soldat.getApellido());

        System.out.println(Utils.randomRango());
    }
}

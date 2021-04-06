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
        Class<Pilot> Pilot = null ;
        Class<Mecanic> Mecanic=null;
        Soldat soldat= ProjectAPI.soldatFactory(Mecanic);
        
    }

}

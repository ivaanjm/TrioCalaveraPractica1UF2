/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import m06.uf2.logic.models.Combat;
import m06.uf2.logic.models.Transport;
import m06.uf2.logic.models.Mecanic;
import m06.uf2.logic.models.Soldat;
import m06.uf2.logic.models.Missio;
import m06.uf2.logic.models.Pilot;
import m06.uf2.logic.models.Dron;
import m06.uf2.logic.models.Aeronau;
import m06.uf2.logic.models.Pilotada;
import org.hibernate.Session;

/**
 *
 * @author manel
 */
public class ProjectAPI {

    /**
     * Afegeix mecanics a aeronau pilotada
     *
     * @param lo LLista dels mecanics
     * @param p Aeronau
     * @return
     */
    public static Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p) {
        List<Mecanic> ret = null;
        for (Soldat soldat : lo) {
            if (soldat.getEsp().toLowerCase().equals("mecanic")) {
                ret.add(new Mecanic(soldat.getId(), soldat.getRango(), soldat.getNombre(), soldat.getApellido(), soldat.getEsp()));
            }
        }
        if (ret != null) {
            p.setMecanic(ret);
        } else {
            System.out.println("error no hay mecanicos");
        }
        return p;
    }

    /**
     * Afegeix missions a Aeronau
     *
     * @param lm
     * @param a Aeronau
     * @return
     */
    public static Aeronau addMissionsToAeronau(List<Missio> lm, Aeronau a) {
        List<Aeronau> aeronaus = null;
        aeronaus.add(a);
        for (Missio missio : lm) {
            missio.setAeronaus(aeronaus);

        }

        return a;
    }

    /**
     * Afegeix pilot a aeronau pilotada
     *
     * @param p aeronau
     * @param a
     * @return
     */
    public static Aeronau addPilotToAeronauPilotada(Pilot p, Pilotada a) {
        System.out.println("Piloto "+p.toString());
        a.setPiloto(p);
        return a;
    }

    /**
     * Retorna una instancia del tipus demanat amb dades ficticies Exemple
     * d'utilització: Pilotada p =
     * (Pilotada)ProjectAPI.aeronauFactory(Combat.class);
     *
     * @param tipus (Dron, Transport, Combat)
     * @return
     */
    public static Aeronau aeronauFactory(Class<?> tipus) {
        Aeronau ret = null;
        Faker f = new Faker();
        switch (tipus.getSimpleName().toLowerCase()) {
            case "transport":
                 
                ret = new Transport(0, f.name().firstName(), tipus.getSimpleName().toLowerCase()) {
                };
                break;
            case "combat":
               
                ret = new Combat(0, f.name().firstName(), tipus.getSimpleName().toLowerCase()) {
                };
                 
                break;
            case "dron":
               
                ret = new Dron(0, f.name().firstName(), tipus.getSimpleName().toLowerCase()) {
                };
                break;
            default:
                System.out.println("Exepción solo pilotos o mecanicos ");
                break;
        }
        return ret;
    }

    /**
     * REtorna una llista de l'entitat demanada amb dades ficticies
     *
     * @param elements quantitat d'elements a retornar
     * @return
     */
    public static List<Soldat> mecanicsFactory(int elements) {
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        List<Soldat> completa = session.createQuery("FROM Soldat").list();
        List<Soldat> ret = null;
        for (Soldat soldat : completa) {
            do {
                if (soldat.getEsp().toLowerCase().equals("mecanic")) {
                    ret.add(soldat);
                }

            } while (ret.size() <= elements);
        }
        if (ret.size() < elements) {
            System.out.println("No hay tantos mecanicos, el numero maximo es de :" + ret.size());
        }
        // session.close();
        return ret;
    }

    /**
     * Retorna una llista de pilots amb dades ficticies
     *
     * @param elements quantitat d'elements a retornar
     * @return
     */
    public static List<Soldat> pilotsFactory(int elements) {
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        List<Soldat> completa = session.createQuery("FROM Soldat").list();
        List<Soldat> ret = null;
        if (!completa.isEmpty()) {
            for (Soldat soldat : completa) {
                do {
                    if (soldat.getEsp().toLowerCase().equals("pilot")) {
                        ret.add(soldat);
                    }

                } while (ret.size() <= elements);
            }
        } else {
            System.out.println("La lista esta vacia ");
        }

        if (ret.size() < elements) {
            System.out.println("No hay tantos pilotos, el numero maximo es de :" + ret.size());
        }
        return ret;
    }

    /**
     * Retorna una llista de missions amb dades ficticies
     *
     * @param elements quantitat d'elements a retornar
     * @return
     */
    public static List<Missio> missionsFactory(int elements) {
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        List<Missio> completa = session.createQuery("FROM Missio").list();
        List<Missio> ret = null;
        if (!completa.isEmpty()) {
            for (Missio missio : completa) {
                do {
                    ret.add(missio);
                } while (ret.size() <= elements);
            }
        } else {
            System.out.println("La lista esta vacia ");
        }

        if (ret.size() < elements) {
            System.out.println("No hay tantas Misiones, el numero maximo es de :" + ret.size());
        }
        return ret;
    }

    /**
     * Crea una instancia de Mecanic o Pilot segons el paràmetre subministrat
     *
     * @param tipus (macanic o pilot)
     * @return
     */
    public static Soldat soldatFactory(Class<?> tipus) {
        Faker f = new Faker();
        Soldat ret = null;
        switch (tipus.getSimpleName().toLowerCase()) {
            case "pilot":
                ret = new Pilot(0, Utils.randomRango(), f.name().firstName(), f.name().lastName(), tipus.getSimpleName()) {
                };
                break;
            case "mecanic":
                ret = new Mecanic(0, Utils.randomRango(), f.name().firstName(), f.name().lastName(), tipus.getSimpleName()) {
                };

                break;
            default:
                System.out.println("Exepción solo pilotos o mecanicos ");
              
                break;
        }
        
        System.out.println(ret.toString());
        return ret;
    }

    /**
     * Retorna una instancia de missio amb dades ficticies
     *
     * @return
     */
    public static Missio missioFactory() {
        Faker f = new Faker();
        Missio ret = new Missio(0, f.pokemon().name(), f.address().country(), f.date().future(f.number().randomDigit(), TimeUnit.DAYS));
        return ret;
    }

}

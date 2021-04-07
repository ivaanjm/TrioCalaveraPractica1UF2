/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;
import java.util.ArrayList;

import java.util.List;

import java.util.concurrent.TimeUnit;
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
     *
     * @param lo LLista dels mecanics
     * @param p Aeronau
     * @return
     */
    public static Aeronau addMecanicsToPilotada(List<Soldat> lo, Pilotada p) throws APIException {
        List<Mecanic> ret = new ArrayList<>();

        for (Soldat soldat : lo) {
            if (soldat.getEsp().toLowerCase().equals("mecanic")) {
                ret.add(new Mecanic(p, soldat.getId(), soldat.getRango(), soldat.getNombre(), soldat.getApellido(), soldat.getEsp()));
            }
        }
        if (!ret.isEmpty()) {
            p.setMecanics(ret);
        } else {
            throw new APIException("error no hay mecanicos");
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
        a.setMissions(lm);
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

        a.setPilotAeronau(p);
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
    public static Aeronau aeronauFactory(Class<?> tipus) throws APIException {
        Aeronau ret = null;
        Faker f = new Faker();
        switch (tipus.getSimpleName().toLowerCase()) {
            case "transport":
                ret = new Transport(0, f.name().firstName(), tipus.getSimpleName().toLowerCase());
                break;
            case "combat":

                ret = new Combat(0, f.name().firstName(), tipus.getSimpleName().toLowerCase());

                break;
            case "dron":
                ret = new Dron(0, f.name().firstName(), tipus.getSimpleName().toLowerCase());
                break;
            default:
                throw new APIException("Exepción solo tipos de naves ");
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
        Faker f = new Faker();
        List<Soldat> ret = new ArrayList<Soldat>();
        for (int i = 0; i < elements; i++) {
            ret.add(new Mecanic(0, Utils.randomRango(), f.name().firstName(), f.name().fullName(), "Mecanic"));
        }

        return ret;
    }

    /**
     * Retorna una llista de pilots amb dades ficticies
     *
     * @param elements quantitat d'elements a retornar
     * @return
     */
    public static List<Soldat> pilotsFactory(int elements) {

        Faker f = new Faker();
        List<Soldat> ret = new ArrayList<Soldat>();
        for (int i = 0; i < elements; i++) {
            ret.add(new Pilot(0, Utils.randomRango(), f.name().firstName(), f.name().fullName(), "Pilot"));
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

        Faker f = new Faker();
        List<Missio> ret = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            ret.add(new Missio(0, f.pokemon().name(), f.address().country(), f.date().future(Utils.getRandomNumberInRange(1, 100), TimeUnit.DAYS)));
        }

        return ret;
    }

    /**
     * Crea una instancia de Mecanic o Pilot segons el paràmetre subministrat
     *
     * @param tipus (macanic o pilot)
     * @return
     */
    public static Soldat soldatFactory(Class<?> tipus) throws APIException {
        Faker f = new Faker();
        Soldat ret = null;
        switch (tipus.getSimpleName().toLowerCase()) {
            case "pilot":
                ret = new Pilot(0, Utils.randomRango(), f.name().firstName(), f.name().fullName(), tipus.getSimpleName());

                break;
            case "mecanic":
                ret = new Mecanic(0, Utils.randomRango(), f.name().firstName(), f.name().fullName(), tipus.getSimpleName());

                break;
            default:
                throw new APIException("Exepción solo pilotos o mecanicos ");
        }

        return ret;
    }

    /**
     * Retorna una instancia de missio amb dades ficticies
     *
     * @return
     */
    public static Missio missioFactory() {
        Faker f = new Faker();
        Missio ret = new Missio(0, f.pokemon().name(), f.address().country(), f.date().future(Utils.getRandomNumberInRange(1, 100), TimeUnit.DAYS));
        return ret;
    }

}

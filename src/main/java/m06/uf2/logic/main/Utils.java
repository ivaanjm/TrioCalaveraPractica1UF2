package m06.uf2.logic.main;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author manel
 */
public class Utils {

    private static SecureRandom random = new SecureRandom();

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static boolean getRandomTrueFalse() {
        return (getRandomNumberInRange(0, 1) == getRandomNumberInRange(0, 1));
    }

    public static String randomRango() {

        ArrayList<String> rangos = new ArrayList<String>();
        rangos.add("Soldado");
        rangos.add("Soldado de primera");
        rangos.add("Cabo");
        rangos.add("Cabo primero");
        rangos.add("Cabo mayor");
        rangos.add("Sargento");
        rangos.add("Sargento primero");
        rangos.add("Brigada");
        rangos.add("Subteniente");
        rangos.add("Suboficial mayor");
        rangos.add("Oficiales");
        rangos.add("Alférez Teniente");
        rangos.add("Capitán Comandante");
        rangos.add("Teniente Coronel");
        rangos.add("Coronel Oficiales Generales General de brigada");
        rangos.add("General de división Teniente general General del Aire");
        rangos.add("Capitán general");
        Random random = new Random();
        return rangos.get(random.nextInt(rangos.size() - 1));
    }

    public static String randomMissions() {
        ArrayList<String> missiones = new ArrayList<String>();
        missiones.add("Asaltar la Casa Blanca");
        missiones.add("Rescate");
        missiones.add("Asesinato");
        missiones.add("Asalto");
        missiones.add("Secreta");

        Random random = new Random();
        return missiones.get(random.nextInt((missiones.size() - 1)));
            
        
    }

}

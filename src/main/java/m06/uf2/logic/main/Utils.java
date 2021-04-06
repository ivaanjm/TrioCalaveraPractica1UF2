package m06.uf2.logic.main;

import java.security.SecureRandom;
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
    
    public static boolean getRandomTrueFalse()
    {
        return (getRandomNumberInRange(0, 1) == getRandomNumberInRange(0, 1));
    }
    

   
    
}

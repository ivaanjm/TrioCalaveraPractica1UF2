/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import java.util.List;
import m06.uf2.logic.models.Aeronau;
import m06.uf2.logic.models.Missio;
import m06.uf2.logic.models.Pilot;
import m06.uf2.logic.models.Pilotada;
import m06.uf2.logic.models.Soldat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arsenbasha
 */
public class ProjectAPITest {
    
    public ProjectAPITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMecanicsToPilotada method, of class ProjectAPI.
     */
    @Test
    public void testAddMecanicsToPilotada() {
        System.out.println("addMecanicsToPilotada");
        List<Soldat> lo = null;
        Pilotada p = null;
        Aeronau expResult = null;
        Aeronau result = ProjectAPI.addMecanicsToPilotada(lo, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMissionsToAeronau method, of class ProjectAPI.
     */
    @Test
    public void testAddMissionsToAeronau() {
        System.out.println("addMissionsToAeronau");
        List<Missio> lm = null;
        Aeronau a = null;
        Aeronau expResult = null;
        Aeronau result = ProjectAPI.addMissionsToAeronau(lm, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPilotToAeronauPilotada method, of class ProjectAPI.
     */
    @Test
    public void testAddPilotToAeronauPilotada() {
        System.out.println("addPilotToAeronauPilotada");
        Pilot p = null;
        Pilotada a = null;
        Aeronau expResult = null;
        Aeronau result = ProjectAPI.addPilotToAeronauPilotada(p, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aeronauFactory method, of class ProjectAPI.
     */
    @Test
    public void testAeronauFactory() {
        System.out.println("aeronauFactory");
        Class tipus = null;
        Aeronau expResult = null;
        Aeronau result = ProjectAPI.aeronauFactory(tipus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mecanicsFactory method, of class ProjectAPI.
     */
    @Test
    public void testMecanicsFactory() {
        System.out.println("mecanicsFactory");
        int elements = 0;
        List<Soldat> expResult = null;
        List<Soldat> result = ProjectAPI.mecanicsFactory(elements);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pilotsFactory method, of class ProjectAPI.
     */
    @Test
    public void testPilotsFactory() {
        System.out.println("pilotsFactory");
        int elements = 0;
        List<Soldat> expResult = null;
        List<Soldat> result = ProjectAPI.pilotsFactory(elements);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of missionsFactory method, of class ProjectAPI.
     */
    @Test
    public void testMissionsFactory() {
        System.out.println("missionsFactory");
        int elements = 0;
        List<Missio> expResult = null;
        List<Missio> result = ProjectAPI.missionsFactory(elements);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soldatFactory method, of class ProjectAPI.
     */
    @Test
    public void testSoldatFactory() {
        System.out.println("soldatFactory");
        Class tipus = null;
        Soldat expResult = null;
        Soldat result = ProjectAPI.soldatFactory(tipus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of missioFactory method, of class ProjectAPI.
     */
    @Test
    public void testMissioFactory() {
        System.out.println("missioFactory");
        Missio expResult = null;
        Missio result = ProjectAPI.missioFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

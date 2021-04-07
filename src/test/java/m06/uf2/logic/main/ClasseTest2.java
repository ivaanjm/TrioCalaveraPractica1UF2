package m06.uf2.logic.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import m06.uf2.logic.main.ProjectAPI;
import m06.uf2.logic.main.SingleSession;
import m06.uf2.logic.models.Combat;
import m06.uf2.logic.models.Transport;
import m06.uf2.logic.models.Mecanic;
import m06.uf2.logic.models.Missio;
import m06.uf2.logic.models.Pilot;
import m06.uf2.logic.models.Dron;
import m06.uf2.logic.models.Pilotada;
import m06.uf2.logic.models.Aeronau;
import org.hibernate.Session;
import org.junit.Test;

/**
 *
 * @author manel
 */
public class ClasseTest2 {
     
    @Test
   //Verificacio d'entitats
   public void Test1() {

      Session session = SingleSession.getSesio();

      assertTrue(session.createCriteria(Combat.class).list().size() >= 0 );
      assertTrue(session.createCriteria(Transport.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Mecanic.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Missio.class).list().size() >= 0 ); 
      assertTrue(session.createCriteria(Pilot.class).list().size() >= 0 );
      assertTrue(session.createCriteria(Dron.class).list().size() >= 0 ); 

      session.close();
  }
     
     @Test
     //Pilot i aeronau pilotada
     public void Test2() {
        
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        
        Pilot p;
        Pilotada ap;
                
        p = (Pilot)ProjectAPI.soldatFactory(Pilot.class);
        ap = (Pilotada)ProjectAPI.aeronauFactory(Combat.class);
         
        ProjectAPI.addPilotToAeronauPilotada(p, ap);
        
        session.save(p);
        session.save(ap);
        
        assertEquals(ap.getPiloto().getId(), p.getId());
        
        session.getTransaction().commit();
        session.close();
    }
    
    
    @Test
    // pilotada i mecanics
    public void Test3() {
        
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        
        Aeronau v;
        Pilotada ve;
                
        v = ProjectAPI.addMecanicsToPilotada(ProjectAPI.mecanicsFactory(2),(Pilotada)ProjectAPI.aeronauFactory(Transport.class));
        session.save(v);
        ve = (Pilotada)session.get(Transport.class, v.getId());
        assertEquals(ve.getMecanic().size(), 2);
        
        v = ProjectAPI.addMecanicsToPilotada(ProjectAPI.mecanicsFactory(4),(Pilotada)ProjectAPI.aeronauFactory(Combat.class));
        session.save(v);
        ve = (Pilotada)session.get(Combat.class, v.getId());
        assertEquals(ve.getMecanic().size(), 4);
        
        session.getTransaction().commit();
        session.close();
    }
    
    @Test
    // Aeronau i missions
    public void Test4() {
        
        Session session = SingleSession.getSesio();
        session.beginTransaction();
        
        Aeronau a;
       
        List<Missio> m = ProjectAPI.missionsFactory(3);             
        a = ProjectAPI.addMissionsToAeronau(m, (Transport)ProjectAPI.aeronauFactory(Transport.class));
        
        session.save(a);
        session.getTransaction().commit();
        session.refresh(a);
        
        Missio m2 = (Missio)session.get(Missio.class, a.getMisiones().get(0).getId());
        assertEquals(m2.getAeronaus().contains(a), true);
        
        session.close();
    }
}

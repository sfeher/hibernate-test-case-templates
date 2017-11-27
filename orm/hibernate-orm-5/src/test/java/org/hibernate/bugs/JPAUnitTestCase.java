package org.hibernate.bugs;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Hibernate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitTestCase {

	private EntityManagerFactory entityManagerFactory;

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "templatePU" );
	}

	@After
	public void destroy() {
		entityManagerFactory.close();
	}

	// Entities are auto-discovered, so just add them anywhere on class-path
	// Add your tests, using standard JUnit.
	@Test
	public void hhh123Test() throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

                HrpBbstorzs bbstorzs=new HrpBbstorzs("BB", 1); // manager 1 first
                bbstorzs.setNev("manager");
                bbstorzs.setAnyjaneve("-");
                bbstorzs.setTaxNr("-");
                bbstorzs.setBbsirIrszam(1);
                bbstorzs.setHazszhszam("1");
                bbstorzs.setBbmKoztneve("-");
                bbstorzs.setBbmUtcanev("-");
                bbstorzs.setKoztneve("-");
                bbstorzs.setStatus("0");
                bbstorzs.setUtcanev("-");
                bbstorzs.setCrd(new Date());
                bbstorzs.setCallerId("-");
                bbstorzs.setCru("-");
                entityManager.persist(bbstorzs);               
                
                bbstorzs=new HrpBbstorzs("BB", 2); // employee
                bbstorzs.setNev("employee");
                bbstorzs.setAnyjaneve("-");
                bbstorzs.setTaxNr("-");
                bbstorzs.setBbsirIrszam(1);
                bbstorzs.setHazszhszam("1");
                bbstorzs.setBbmKoztneve("-");
                bbstorzs.setBbmUtcanev("-");
                bbstorzs.setKoztneve("-");
                bbstorzs.setStatus("0");
                bbstorzs.setUtcanev("-");
                bbstorzs.setCrd(new Date());
                bbstorzs.setCallerId("-");
                bbstorzs.setCru("-");
                entityManager.persist(bbstorzs);                             
                
                bbstorzs=new HrpBbstorzs("BB", 3);  // manager2
                bbstorzs.setNev("manager 2");
                bbstorzs.setAnyjaneve("-");
                bbstorzs.setTaxNr("-");
                bbstorzs.setBbsirIrszam(1);
                bbstorzs.setHazszhszam("1");
                bbstorzs.setBbmKoztneve("-");
                bbstorzs.setBbmUtcanev("-");
                bbstorzs.setKoztneve("-");
                bbstorzs.setStatus("0");
                bbstorzs.setUtcanev("-");
                bbstorzs.setCrd(new Date());
                bbstorzs.setCallerId("-");
                bbstorzs.setCru("-");
                entityManager.persist(bbstorzs);                           
                
                HrpBbmchi07 chi07=new HrpBbmchi07(); // binding manager to emp
                chi07.setFelettesneve("testmanager");
                chi07.setFelettestorzsszam(1);                
                chi07.setHrpBbmchi07PK(new HrpBbmchi07PK("BB", new Date(), 2));                
                entityManager.persist(chi07);
                
                chi07=new HrpBbmchi07(); // binding manager2 to emp
                chi07.setFelettesneve("testmanager2");
                chi07.setFelettestorzsszam(3);             
                Calendar cal=Calendar.getInstance();
                cal.setTimeInMillis(0);
                cal.set(1996, 1, 2);
                chi07.setHrpBbmchi07PK(new HrpBbmchi07PK("BB", cal.getTime(), 2));                
                entityManager.persist(chi07);                              
                entityManager.flush();
                entityManager.getTransaction().commit();
                
                
                entityManager.getTransaction().begin();
                
                HrpBbstorzs result=entityManager.find(HrpBbstorzs.class,new HrpBbstorzsPK("BB",2)); // get emp
                Hibernate.initialize(result.getFelettes());  //init persistent bag
                
                List<HrpBbmchi07> clist=entityManager.createQuery("select t from HrpBbmchi07 t where hrpBbmchi07PK.bbmBbstTorzsszam=2").getResultList();                                           
                entityManager.getTransaction().commit();
		// Do stuff...
		
		entityManager.close();
	}
}

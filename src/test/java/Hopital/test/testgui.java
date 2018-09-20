package Hopital.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Hopital.model.Secretaire;

public class testgui {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hopital");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Secretaire sec= new Secretaire("Jessica", "Jess");
		em.persist(sec);
		
		tx.commit();
		em.close();
		
		emf.close();
	}
}

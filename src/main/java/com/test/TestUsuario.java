package com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modelo.Usuario;

public class TestUsuario {

	// @PersistenceContext(unitName="aplicacion")
	private static EntityManager manager;

	// @PersistenceUnit(unitName="aplicacion")
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("aplicacion");
		manager = emf.createEntityManager();

		Usuario u = new Usuario(null, "test", "jk", "tes", "test", "jk@gmail.com", new Long(10));
		Usuario u2 = new Usuario(null, "test", "jk", "tes", "test", "jk@gmail.com", new Long(10));
		
		manager.getTransaction().begin();
		manager.persist(u);
		manager.persist(u2);
		
		manager.getTransaction().commit();
		List<Usuario> usaurios = (List<Usuario>) manager.createQuery("FROM Usuario").getResultList();
		System.out.println(" en la base de datis tienes "+ usaurios.size()+ " usuarios ");
		
	}
}

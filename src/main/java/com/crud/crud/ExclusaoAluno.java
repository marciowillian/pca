package com.crud.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.model.Aluno;

public class ExclusaoAluno {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlunoPU");
		EntityManager manager = emf.createEntityManager();

		Aluno a1 = new Aluno();
		
		a1 = manager.find(Aluno.class, 1L);
		
		manager.getTransaction().begin();
		manager.remove(a1);
		manager.getTransaction().commit();
		manager.close();
	}
}

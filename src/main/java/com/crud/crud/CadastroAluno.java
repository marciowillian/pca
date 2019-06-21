package com.crud.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.model.Aluno;

public class CadastroAluno {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlunoPU");
		EntityManager manager = emf.createEntityManager();
		
		Aluno a1 = new Aluno();
		
		a1.setNome("João das Couves");
		a1.setDataNascimento("25/03/1998");
		a1.setSexo("M");
		a1.setMatricula("AL2325");
		
		manager.getTransaction().begin();
		manager.merge(a1);
		manager.getTransaction().commit();
		manager.close();
		
		System.out.println("Aluno Salvo com sucesso!");
	}

}

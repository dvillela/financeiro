package br.edu.fema.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.fema.model.Pessoa;

public class AlteraCPFPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criar o EntityMaganer
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
		EntityManager em = emf.createEntityManager();

		Pessoa pessoa = em.find(Pessoa.class, 1L);

		System.out.println("Nome da pessoa = " + pessoa.getNome());

		pessoa.setCpf("676783758607-87");

		// Persistir o objetjo
		em.getTransaction().begin();
		pessoa.setCpf("676783758607-87");
		// em.persist(pessoa);
		em.getTransaction().commit();

	}

}

package br.edu.fema.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.fema.model.Pessoa;

public class CriaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criar o EntityMaganer
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
		EntityManager em = emf.createEntityManager();

		// Nova pessoa, estado transiente
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Domingos Villela JR");

		// Persistir o objetjo
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();

	}

}

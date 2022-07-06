package br.edu.fema.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.fema.model.Pessoa;

public class TestandoEstados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto no estado transiente
		Pessoa p = new Pessoa();
		p.setNome("Bill Gates");
		p.setCpf("84357675697-23");

		// Criar o EntityMaganer
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// Transiente --> Gerenciado
		em.persist(p);

		// Gerenciado --> Removido
		em.remove(p);

		em.getTransaction().commit();

	}

}

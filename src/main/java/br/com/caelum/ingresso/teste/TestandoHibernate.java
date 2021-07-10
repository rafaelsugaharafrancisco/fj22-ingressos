package br.com.caelum.ingresso.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.ingresso.model.Filme;

public class TestandoHibernate {

	public static void main(String[] args) {
		System.out.println("Executando Testa Hibernate");
		
		// NamedQuery | JPQL | NativeQuery
		
		criandoNovaTarefa();
		
		//buscandoUmaTarefa();
		
		//excluindoTarefaPorId();
		
		//obtemTarefasFinalizadas();
		
	}

/*	private static void obtemTarefasFinalizadas() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select t from Tarefa as t where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", true);
		
		List<Tarefa> tarefas = query.getResultList();
		
		for (Tarefa tarefa : tarefas) {
			System.out.println("Tarefa: " + tarefa.getDescricao());
		}
		
		manager.close();
		factory.close();
	}

	private static void excluindoTarefaPorId() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 1L);
		
		System.out.println("Tarefa carregada: " + tarefa.getDescricao());
		
		manager.getTransaction().begin();
		manager.remove(tarefa);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

	private static void buscandoUmaTarefa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 3L);
		
		System.out.println("Tarefa carregada: " + tarefa.getDescricao());
		
		manager.close();
		factory.close();
	}*/

	private static void criandoNovaTarefa() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ingresso");
		EntityManager manager = factory.createEntityManager();
		
		Filme filme = new Filme();
		filme.setNome("Capitão America");
		filme.setGenero("Ação");
		
		manager.getTransaction().begin();
		manager.persist(filme);
		manager.getTransaction().commit();		
		
		manager.close();
		factory.close();
	}

}


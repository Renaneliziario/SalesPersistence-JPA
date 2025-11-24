package br.com.renan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class testeConexao {
	public static void main(String [] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("sistemaVendas-PU");
			em = emf.createEntityManager();
			System.out.println("Conexão JPA estabelecida com sucesso!");
		} catch (Exception e) {
			System.err.println("Erro ao estabelecer conexão JPA: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

}

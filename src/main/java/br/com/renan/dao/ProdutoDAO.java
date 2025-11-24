package br.com.renan.dao;

import br.com.renan.dao.generic.GenericDAO;
import br.com.renan.domain.Produto;

/**
@author renan.eliziario
 *
 */
public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {
	
	public ProdutoDAO() {
		super(Produto.class);
	}
	
	public ProdutoDAO(String persistenceUnitName) {
		super(Produto.class, persistenceUnitName);
	}

}

package br.com.renan.services;

import br.com.renan.dao.IProdutoDAO;
import br.com.renan.domain.Produto;
import br.com.renan.exceptions.DAOException;
import br.com.renan.services.generic.GenericService;

/**
@author renan.eliziario
 *
 */

 public class ProdutoService extends GenericService<Produto, Long> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

	@Override
	public Produto cadastrar(Produto entity) throws DAOException {
		return super.cadastrar(entity);
	}

}




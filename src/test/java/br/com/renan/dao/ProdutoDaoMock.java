package br.com.renan.dao;

import java.util.Collection;

import br.com.renan.domain.Produto;
import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 */
public class ProdutoDaoMock implements IProdutoDAO {

	@Override
	public Produto cadastrar(Produto entity) throws DAOException {
		return entity;
	}

	@Override
	public void excluir(Produto entity) throws DAOException {
		
	}

	@Override
	public Produto alterar(Produto entity) throws DAOException {
		return entity;
	}

	@Override
	public Produto consultar(Long id) throws DAOException {
		Produto produto = new Produto();
		produto.setId(id);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		return null;
	}

}

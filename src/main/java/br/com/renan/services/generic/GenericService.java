/**
 * 
 */
package br.com.renan.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.renan.dao.generic.IGenericDAO;
import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 */
public abstract class GenericService<T, E extends Serializable> 
	implements IGenericService<T, E> {
	
	protected IGenericDAO<T,E> dao;
	
	public GenericService(IGenericDAO<T,E> dao) {
		this.dao = dao;
	}

	@Override
	public T cadastrar(T entity) throws DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E id) throws DAOException {
		try {
			return this.dao.consultar(id);
		} catch (Exception e) {
			throw new DAOException("ERRO CONSULTANDO OBJETO ", e);
		}
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}

}

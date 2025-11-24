/**
 * 
 */
package br.com.renan.dao;

import br.com.renan.dao.generic.IGenericDAO;
import br.com.renan.domain.Venda;
import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda) throws DAOException;
	
	public void cancelarVenda(Venda venda) throws DAOException;
	
	@Override
	public Venda cadastrar(Venda entity) throws DAOException;
}

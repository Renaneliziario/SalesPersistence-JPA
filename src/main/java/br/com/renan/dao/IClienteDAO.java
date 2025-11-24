/**
 * 
 */
package br.com.renan.dao;

import br.com.renan.dao.generic.IGenericDAO;
import br.com.renan.domain.Cliente;
import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}

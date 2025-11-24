/**
 * 
 */
package br.com.renan.services;

import br.com.renan.dao.IClienteDAO;
import br.com.renan.domain.Cliente;
import br.com.renan.exceptions.DAOException;
import br.com.renan.services.generic.GenericService;

/**
@author renan.eliziario
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}


	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		return this.clienteDAO.buscarPorCPF(cpf);
	}

	@Override
	public void excluir(Cliente entity) throws DAOException {
		
	}


	@Override
	public Cliente cadastrar(Cliente entity) throws DAOException {
		return super.cadastrar(entity);
	}

}

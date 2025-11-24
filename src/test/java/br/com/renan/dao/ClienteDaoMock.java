package br.com.renan.dao;

import java.util.Collection;

import br.com.renan.domain.Cliente;
import br.com.renan.exceptions.DAOException;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Cliente cadastrar(Cliente entity) throws DAOException {
		return entity;
	}

	@Override
	public void excluir(Cliente entity) throws DAOException {
		
	}

	@Override
	public Cliente alterar(Cliente entity) throws DAOException {
		return entity;
	}

	@Override
	public Cliente consultar(Long id) throws DAOException {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() throws DAOException {
		return null;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}


}

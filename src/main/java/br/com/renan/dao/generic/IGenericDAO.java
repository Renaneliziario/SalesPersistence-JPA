package br.com.renan.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 * Interface genérica para métodos de CRUD(Create, Read, Update and Delete)
 */
public interface IGenericDAO <T, E extends Serializable> {

    /**
     * Método para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna o mesmo objeto cadastrado
     */
    public T cadastrar(T entity) throws DAOException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param entity a ser excluído
     */
    public void excluir(T entity) throws DAOException;

    /**
     *Método para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     */
    public T alterar(T entity) throws DAOException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param id chave única do dado a ser consultado
     * @return
     */
    public T consultar(E id) throws DAOException;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     */
    public Collection<T> buscarTodos() throws DAOException;
}

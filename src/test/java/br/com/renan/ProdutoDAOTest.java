package br.com.renan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.After;
import org.junit.Test;

import br.com.renan.dao.IProdutoDAO;
import br.com.renan.dao.ProdutoDAO;
import br.com.renan.domain.Produto;
import br.com.renan.exceptions.DAOException;

/**
@author renan.eliziario
 *
 */
public class ProdutoDAOTest {
	
	private IProdutoDAO produtoDao;

	public ProdutoDAOTest() {
		produtoDao = new ProdutoDAO("sistemaVendas-Test-PU");
	}
	
	@After
	public void end() throws DAOException {
		Collection<Produto> list = produtoDao.buscarTodos();
		list.forEach(prod -> {
			try {
				produtoDao.excluir(prod);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		});
	}

	private Produto criarProduto(String codigo, String marca) throws DAOException {
		Produto produto = new Produto();
		produto.setCodigo(codigo);
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		return produtoDao.cadastrar(produto);
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produto = criarProduto("A1", "Apple");
		assertNotNull(produto);
		Produto produtoDB = this.produtoDao.consultar(produto.getId());
		assertNotNull(produtoDB);
	}
	
	@Test
	public void salvar() throws DAOException {
		Produto produto = criarProduto("A2", "Samsung");
		assertNotNull(produto);
	}
	
	@Test
	public void excluir() throws DAOException {
		Produto produto = criarProduto("A3", "Sony");
		assertNotNull(produto);
		this.produtoDao.excluir(produto);
		Produto produtoBD = this.produtoDao.consultar(produto.getId());
		assertNull(produtoBD);
	}
	
	@Test
	public void alterarProduto() throws DAOException {
		Produto produto = criarProduto("A4", "Dell");
		produto.setNome("Rodrigo Pires");
		produtoDao.alterar(produto);
		Produto produtoBD = this.produtoDao.consultar(produto.getId());
		assertNotNull(produtoBD);
		assertEquals("Rodrigo Pires", produtoBD.getNome());
	}
	
	@Test
	public void buscarTodos() throws DAOException {
		criarProduto("A5", "LG");
		criarProduto("A6", "Motorola");
		Collection<Produto> list = produtoDao.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		for (Produto prod : list) {
			this.produtoDao.excluir(prod);
		}
		
		list = produtoDao.buscarTodos();
		assertTrue(list.isEmpty());
	}
}
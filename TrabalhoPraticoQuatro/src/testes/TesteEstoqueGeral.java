package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import classes.CargaInicial;
import classes.Celular;
import classes.Cliente;
import classes.Endereco;
import classes.EstoqueGeral;
import classes.RG;

class TesteEstoqueGeral {

	EstoqueGeral estoqueGeral = new EstoqueGeral(CargaInicial.listaLivros(),CargaInicial.listaRevista(),CargaInicial.listaClientes()); 
    
	@Test
	void testPesquisarCliente()
	{
		String nomeCliente = "Desconhecido";
		assertEquals(null,estoqueGeral.pesquisarCliente(nomeCliente));
	}

	@Test
	void testPesquisarLivroPorTitulo()
	{
		String titulo = "Titulo Desconhecido";
		assertEquals(null,estoqueGeral.pesquisarLivroPorTitulo(titulo));
	}

	@Test
	void testPesquisarLivroPorAutor() {
		String autor = "Autor Desconhecido";
		assertEquals(null,estoqueGeral.pesquisarLivroPorAutor(autor));
	}

	@Test
	void testPesquisarRevistaPorEditora() {
		String editora = "Banda TV";
		assertEquals(null,estoqueGeral.pesquisarRevistaPorEditora(editora));
	}

	@Test
	void testPesquisarRevistaPorNome() {
		String nome = "Plaboyzinho";
		assertEquals(null,estoqueGeral.pesquisarRevistaPorNome(nome));
	}

}

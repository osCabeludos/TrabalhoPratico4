package classes;

public class VendaLivro implements Venda
{	/**
	 * @author Rodolfo
	 * @author Marcos
	 * Cadastra uma venda, transferindo uma quantidade de livros do estoque para o cliente
	 */
	@Override
	public void registrarVenda( String nome, int quantidade,Cliente cliente,EstoqueGeral estoque)
	{
		Livro livro = estoque.pesquisarLivroPorTitulo(nome);
		if(livro != null) 
		{
			livro.setQuantidade(quantidade);
			cliente.setLivrosComprados(quantidade);
		}
	}
}

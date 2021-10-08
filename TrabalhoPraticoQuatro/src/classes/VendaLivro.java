package classes;

public class VendaLivro implements Venda
{
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

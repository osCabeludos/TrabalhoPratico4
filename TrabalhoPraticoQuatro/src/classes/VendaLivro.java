package classes;

public class VendaLivro implements Venda
{
	@Override
	public void registrarVenda( String nome, int quantidade,Cliente cliente,EstoqueGeral estoque)
	{
		Livro livro = estoque.pesquisarLivroPorTitulo(nome);
		if(livro != null) 
		{
			int remanescente = livro.getQuantidade() - quantidade;
			livro.setQuantidade(remanescente);
			cliente.setRevistasCompradas(quantidade);
		}
	}
}

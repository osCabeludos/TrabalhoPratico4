package classes;

public class VendaRevista implements Venda
{
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * Cadastra uma venda, transferindo uma quantidade de revistas do estoque para o cliente
	 */
	@Override
	public void registrarVenda( String nome, int quantidade,Cliente cliente,EstoqueGeral estoque)
	{
		Revista revista = estoque.pesquisarRevistaPorNome(nome);
		
		if(revista != null) 
		{
			int remanescente= revista.getQuantidade() - quantidade;
			revista.setQuantidade(remanescente);
			cliente.setRevistasCompradas(quantidade);
		}
	}

}

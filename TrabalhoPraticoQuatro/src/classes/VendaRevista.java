/**
 * @author Rodolfo
 * @author Marcos
 * Classe que cadastra uma venda, transferindo uma quantidade de revistas do estoque para o cliente
 */
package classes;

public class VendaRevista implements Venda
{

	@Override
	public void registrarVenda(String nome, int quantidade,Cliente cliente,EstoqueGeral estoque)
	{
		Revista revista = estoque.pesquisarRevistaPorNome(nome);

		if(revista != null) 
		{
			revista.setQuantidade(quantidade);
			cliente.setRevistasCompradas(quantidade);
		}
	}

}

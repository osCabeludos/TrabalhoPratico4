/**
 * A definição de estoque geral
 * <p>
 * Define os métodos do estoque de tudo quanto existe na loja
 * @author Rodolfo
 * @author Marcos
 */

package classes;
import java.util.ArrayList;

public class EstoqueGeral
{
	private int estoqueLivros, estoqueRevistas;
	private ArrayList<Livro> listaLivros;
	private ArrayList<Revista> listaRevistas;
	private ArrayList<Cliente> listaClientes;

	public EstoqueGeral(ArrayList<Livro> livro, ArrayList<Revista> revista,ArrayList<Cliente> listaClientes)
	{
		this.estoqueLivros = livro.size();
		this.estoqueRevistas = revista.size();
		this.listaLivros = livro;
		this.listaClientes  = listaClientes;
		this.listaRevistas = revista;
	}
	public ArrayList<Livro> getListaLivros()
	{
		return this.listaLivros;
	}
	public ArrayList<Cliente> getListaClientes()
	{
		return this.listaClientes;
	}
	public int getEstoqueLivros()
	{
		return estoqueLivros;
	}

	public void setEstoqueLivros(int estoqueLivros) {
		this.estoqueLivros = estoqueLivros;
	}

	public int getEstoqueRevistas() {
		return estoqueRevistas;
	}

	public void setEstoqueRevistas(int estoqueRevistas) {
		this.estoqueRevistas = estoqueRevistas;
	}

	public ArrayList<Livro> getLivro() {
		return listaLivros;
	}

	public void setLivro(ArrayList<Livro> livro) {
		this.listaLivros = livro;
	}

	public ArrayList<Revista> getListaRevistas() {
		return this.listaRevistas;
	}

	public void setRevista(ArrayList<Revista> revista) {
		this.listaRevistas = revista;
	}

	/**
	 * @author Rodolfo
	 * @author Marcos
	 * @param  nome do cliente
	 * @return Retorna o objeto da classe Cliente, e nulo caso não seja encontrado
	 */
	public Cliente pesquisarCliente(String nomeCompleto) 
	{
		for(int a = 0; a < this.listaClientes.size();a++) 
		{
			if(this.listaClientes.get(a).getNome().equalsIgnoreCase(nomeCompleto))
			{
				return this.listaClientes.get(a);
			}
		}
		return null;
	}

	/**
	 * Elimina um determinado cliente da lista de clientes
	 * <p>
	 * @author Rodolfo
	 * @param  nome do cliente
	 * @return void
	 */
	public void eliminarCliente(String nomeCompleto) 
	{
		Cliente cliente = this.pesquisarCliente(nomeCompleto);
		this.getListaClientes().remove(cliente);
	}
	/**
	 * Elimina um determinado livro da lista de livros
	 * <p>
	 * @author Rodolfo
	 * @param  titulo do livro
	 * @return void
	 */
	public void eliminarLivro(String titulo) 
	{
		Livro livro = this.pesquisarLivroPorTitulo(titulo);
		this.getListaLivros().remove(livro);
	}
	/**
	 * Elimina uma determinada revista da lista de revistas
	 * <p>
	 * @author Rodolfo
	 * @param  titulo da revista
	 * @return void
	 */
	public void eliminarRevista(String nome) 
	{
		Revista revista = this.pesquisarRevistaPorNome(nome);
		this.getListaRevistas().remove(revista);
	}
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * @param  titulo do livro
	 * @return Retorna o objeto da classe Livro, e nulo caso não seja encontrado
	 */
	public Livro pesquisarLivroPorTitulo(String nome)
	{
		for(int a = 0; a < this.getEstoqueLivros();a++) 
		{
			Livro tmp = this.getLivro().get(a);
			if(tmp.getTitulo().equalsIgnoreCase(nome))
			{
				return tmp;
			}
		}
		return null;
	}
	/**
	 * Este é um filtro de pesquisa de livro
	 * @author Rodolfo
	 * @author Marcos
	 * @param  autor do livro
	 * @return Retorna o objeto da classe Livro, e nulo caso não seja encontrado
	 */
	public Livro pesquisarLivroPorAutor(String autor)
	{
		ArrayList<Livro> resultados = this.getListaLivros();
		for(int a = 0; a < this.getEstoqueLivros();a++) 
		{
			Livro tmp = resultados.get(a);
			if(tmp.getAutor().equalsIgnoreCase(autor))
			{
				return tmp;
			}
		}
		return null;
	}
	/**
	 * Este é um filtro de pesquisa de revista
	 * @author Rodolfo
	 * @author Marcos
	 * @param  editora da revista
	 * @return Retorna o objeto da classe Revista, e nulo caso não seja encontrado
	 */
	public Revista pesquisarRevistaPorEditora(String editora)
	{
		ArrayList<Revista> resultados = this.getListaRevistas();
		for(int a = 0; a < this.getEstoqueRevistas();a++) 
		{
			Revista revista = resultados.get(a);
			if(revista.getEditora().equalsIgnoreCase(editora))
			{
				return revista;
			}
		}
		return null;
	}
	/**
	 * Este é um filtro de pesquisa de revista
	 * @author Rodolfo
	 * @author Marcos
	 * @param  nome da revista
	 * @return Retorna o objeto da classe Revista, e nulo caso não seja encontrado
	 */
	public Revista pesquisarRevistaPorNome(String nome)
	{
		for(Revista revista : this.getListaRevistas()) 
		{
			if(revista.getNome().equalsIgnoreCase(nome))
			{
				return revista;
			}
		}
		return null;
	}
	/**
	 * Cadastramento de um cliente
	 * @author Rodolfo
	 * @param  Cliente novoCliente
	 * @return void
	 */
	public void cadastrarCliente(Cliente novoCliente) 
	{
		this.getListaClientes().add(novoCliente);
	}
	/**
	 * Cadastramento de um livro
	 * @author Rodolfo
	 * @param  Livro novoLivro 
	 * @return void
	 */
	public void cadastrarLivro(Livro novoLivro) 
	{
		this.getListaLivros().add(novoLivro);
	}
	/**
	 * Cadastramento de uma revista
	 * @author Rodolfo
	 * @param  Revista novaRevista 
	 * @return void
	 */
	public void cadastrarRevista(Revista novaRevista) 
	{
		this.getListaRevistas().add(novaRevista);
	}
}

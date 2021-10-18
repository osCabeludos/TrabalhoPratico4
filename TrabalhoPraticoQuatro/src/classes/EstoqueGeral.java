package classes;
import java.util.ArrayList;
/**
 * @author Rodolfo
 * @author Marcos
 * Define os m�todos e par�metros da classe de Estoque Geral.
 */
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
	 * Retorna o objeto da classe Cliente , tendo o nome passado como par�metro, e nulo caso n�o seja encontrado
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
	 * @author Rodolfo
	 * Elimina um cliente da lista de clientes
	 */
        public void eliminarCliente(String nomeCompleto) 
	{
            Cliente cliente = this.pesquisarCliente(nomeCompleto);
            this.getListaClientes().remove(cliente);
	}
        /**
	 * @author Rodolfo
	 * Elimina um livro da lista de livros
	 */
        public void eliminarLivro(String titulo) 
	{
            Livro livro = this.pesquisarLivroPorTitulo(titulo);
            this.getListaLivros().remove(livro);
	}
        /**
	 * @author Rodolfo
	 * Elimina uma revista da lista das revistas
	 */
        public void eliminarRevista(String nome) 
	{
            Revista revista = this.pesquisarRevistaPorNome(nome);
            this.getListaRevistas().remove(revista);
	}
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * Retorna o objeto livro com o t�tulo passado como par�metro,e nulo caso n�o seja encontrado
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
	 * @author Rodolfo
	 * @author Marcos
	 * M�todo que funciona como filtro de pesquisa, retornando uma cole��o de livros com o mesmo autor.
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
	 * @author Rodolfo
	 * @author Marcos
	 * M�todo que funciona como filtro de pesquisa, retornando uma cole��o de revista com a mesma editora.
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
	 * @author Rodolfo
	 * @author Marcos
	 * Retorna a revista com o t�tulo passado como par�metro,e nulo caso n�o seja encontrado
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
	 * @author Rodolfo
	 * M�todo que cadastra um cliente novo
	 */
	public void cadastrarCliente(Cliente novoCliente) 
	{
		this.getListaClientes().add(novoCliente);
	}
	/**
	 * @author Rodolfo
	 * M�todo que cadastra um livro novo
	 */
	public void cadastrarLivro(Livro novoLivro) 
	{
		this.getListaLivros().add(novoLivro);
	}
	/**
	 * @author Rodolfo
	 * M�todo que cadastra uma revista nova
	 */
	public void cadastrarRevista(Revista novaRevista) 
	{
		this.getListaRevistas().add(novaRevista);
	}
}

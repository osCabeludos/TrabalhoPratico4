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
}

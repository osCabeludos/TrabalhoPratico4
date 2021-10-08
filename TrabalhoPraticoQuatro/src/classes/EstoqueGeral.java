package classes;
import java.util.ArrayList;
/**
 * @author Rodolfo
 * @author Marcos
 * Define os m�todos e par�metros de Cliente.
 */
public class EstoqueGeral
{
	private int estoqueLivros, estoqueRevistas;
	private ArrayList<Livro> listaLivros;
	private ArrayList<Revista> listaRevistas;
	
	public EstoqueGeral(ArrayList<Livro> livro, ArrayList<Revista> revista)
	{
		this.estoqueLivros = livro.size();
		this.estoqueRevistas = revista.size();
		this.listaLivros = livro;
		this.listaRevistas = revista;
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

	public ArrayList<Revista> getRevista() {
		return listaRevistas;
	}

	public void setRevista(ArrayList<Revista> revista) {
		this.listaRevistas = revista;
	}
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * Retorna o livro com o t�tulo passado como par�metro
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
	 * Retorna a revista com o t�tulo passado como par�metro
	 */
	public Revista pesquisarRevistaPorNome(String nome)
	{
		for(int a = 0; a < this.getEstoqueRevistas();a++) 
		{
			Revista tmp = this.getRevista().get(a);
			if(tmp.getNome().equalsIgnoreCase(nome))
			{
				return tmp;
			}
		}
		return null;
	}
}

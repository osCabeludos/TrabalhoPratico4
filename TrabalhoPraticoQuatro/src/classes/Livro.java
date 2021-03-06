/**
 * A defini??o de livro
 * <p>
 * Define os m?todos da classe livro
 * @author Rodolfo
 */

package classes;
import java.util.Date;
public class Livro extends Produto 
{
	private String autor;
	private String generoLiterario;
	private int quantidade;
	
	public Livro(String autor, String generoLiterario, String titulo, String dataDePublicacao, 
			float preco, String editora, int edicao,int quantidade ) {
		this.autor = autor;
		this.generoLiterario = generoLiterario;
		super.titulo = titulo;
		super.dataDePublicacao = dataDePublicacao;
		super.preco = preco;
		super.editora = editora;
		super.edicao = edicao;
		this.quantidade = quantidade;
	}
	public void setQuantidade(int q)
	{
		this.quantidade -= q;
	}
	public int getQuantidade()
	{
		return this.quantidade;
	}
	public String getAtributoComparacao() {
		return getTitulo();
	}
	public String toString() {
		return super.titulo + " -LIVRO de " + autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGeneroLiterario() {
		return generoLiterario;
	}


	public void setGeneroLiterario(String generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
	/**
	 * Edita as informacoes de um determinado livro
	 * @author Rodolfo
	 * @param String autor, String generoLiterario, String titulo, String dataDePublicacao, float preco, String editora, int edicao,int quantidade
	 * @return void
	 */
	public void atualizarLivro(String autor, String generoLiterario, String titulo, String dataDePublicacao, float preco, String editora, int edicao,int quantidade)
	{
		this.setAutor(autor);
		this.setGeneroLiterario(generoLiterario);
		super.setTitulo(titulo); 
		super.setDataDePublicacao(dataDePublicacao);
		super.setPreco(preco);
		super.setEditora(editora);
		super.setEdicao(edicao);
		this.setQuantidade(edicao);
	}
}

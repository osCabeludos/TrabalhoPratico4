/**
 * A definição de revista
 * <p>
 * Define os métodos da classe revista
 * @author Rodolfo
 */
package classes;

import java.util.Date;

public class Revista extends Produto {
	
	private String nome;
	private String tipoDeRevista;
        private int quantidade;
	
	public Revista(String nome, String tipoDeRevista, String titulo, String dataDePublicacao, 
			float preco, String editora, int edicao,int quantidade) {
		this.nome = nome;
                this.quantidade = quantidade;
		this.tipoDeRevista = tipoDeRevista;
		super.titulo = titulo;
		super.dataDePublicacao = dataDePublicacao;
		super.preco = preco;
		super.editora = editora;
		super.edicao = edicao;
	}
	
	public int getQuantidade()
        {
            return this.quantidade;
        }
        public void setQuantidade(int q)
        {
            this.quantidade -= q;
        }
	public String getAtributoComparacao() {
		return getNome();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDeRevista() {
		return tipoDeRevista;
	}

	public void setTipoDeRevista(String tipoDeRevista) {
		this.tipoDeRevista = tipoDeRevista;
	}
        /**
        *
        * @author Rodolfo
        * Edita as informacoes de uma determinada revista
        */
        public void atualizarRevista(String nome, String tipoDeRevista, String titulo, String dataDePublicacao, float preco, String editora, int edicao,int quantidade)
        {
            this.setNome(nome);
            this.setQuantidade(quantidade);
            this.setTipoDeRevista(tipoDeRevista);
            super.setTitulo(titulo);
            super.setDataDePublicacao(dataDePublicacao);
            super.setPreco(preco);
            super.setEditora(editora);
            super.setEdicao(edicao);
        }
}

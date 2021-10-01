/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
            this.quantidade = q;
        }
	public String getAtributoComparacao() {
		return getNome();
	}
	
	public String toString() {
		return nome + " " + super.titulo +  " REVISTA da data: " + super.dataDePublicacao;
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


}

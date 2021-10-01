/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

public abstract class Produto {
	
	protected String titulo;
	protected String dataDePublicacao;
	protected float preco;
	protected String editora;
	protected int edicao;
	
	public boolean comparaProduto(Produto product, String a) 
	{
		return product.getAtributoComparacao().equals(a);
	}
	
	protected abstract Object getAtributoComparacao();

	public static void mostraProduto(Produto product) {
		System.out.println(product.toString());
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDataDePublicacao() {
		return dataDePublicacao;
	}
	public void setDataDePublicacao(String dataPublicacao) {
		this.dataDePublicacao = dataPublicacao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

}

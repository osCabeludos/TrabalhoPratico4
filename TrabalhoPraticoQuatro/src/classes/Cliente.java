package classes;
/**
 * @author Rodolfo
 * @author Marcos
 * Define os metodos e par�metros de Cliente.
 */
public class Cliente 
{
	private String nome;
	private RG rg;
	private Endereco endereco;
	private Celular celular;
	private int livrosComprados;
	private int revistasCompradas;
	
	public Cliente(String nome, RG rg,Endereco endereco, Celular celular)
	{
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.celular = celular;
		this.livrosComprados = 0;
		this.revistasCompradas = 0;
	}
	public void setNome(String nome) 
	{
            this.nome = nome;
	}
	public String getNome() 
	{
            return this.nome;
	}
	public void setEndereco(Endereco endereco)
	{
            this.endereco = endereco;
	}
	public Endereco getEndereco() 
	{
            return this.endereco;
	}
	public void setCelular(Celular celular) 
	{
            this.celular = celular;
	}
	public Celular getCelular() 
	{
            return this.celular;
	}
	public void setRG(RG rg) 
	{
            this.rg = rg;
	}
	public RG getRG() 
	{
            return this.rg;
	}
	/**
	 * @author Rodolfo
	 * Adiciona o numero passado como parametro e quantidade de revistas comprados pelo cliente.
	 */
	public void setLivrosComprados(int quantidadeLivrosComprados) // Adiciona um livro comprado â coleçao
	{
            this.livrosComprados += quantidadeLivrosComprados;
	}
	public int getLivrosComprados() 
	{
            return this.livrosComprados;
	}
	public int getRevistaComprados() 
	{
            return this.revistasCompradas;
	}
	/**
	 * @author Rodolfo
	 * adiciona o numero passado como argumento a quantidade de revistas comprados pelo cliente.
	 */
	public void setRevistasCompradas(int quantidadeRevistasCompradas)
	{
            this.revistasCompradas += quantidadeRevistasCompradas;
	}
        public void atualizarCliente(String nome, RG rg,Endereco endereco, Celular celular)
        {
            this.setCelular(celular);
            this.setEndereco(endereco);
            this.setNome(nome);
            this.setRG(rg);
        }
}
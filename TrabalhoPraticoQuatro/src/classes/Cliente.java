package classes;

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
	public void setRevistasCompradas(int quantidadeRevistasCompradas)
	{
            this.revistasCompradas += quantidadeRevistasCompradas;
	}
	

	/*
	 * 	public void registrarCliente(Cliente cliente) 
	{
            List<Cliente> lista = this.getListaClientes();
            lista.add(cliente);
	}
	
	public Cliente pesquisarCliente(String nome) 
	{
            for(int a = 0; a < this.getListaClientes().size();a++) 
            {
                if(this.getListaClientes().get(a).getNome().equalsIgnoreCase(nome)) 
                {
                        return this.getListaClientes().get(a); 
                }
            }
            return null;
	}
       public void addCliente(String nome, RG rg,Endereco endereco, Celular celular,int livrosComprados,int revistasCompradas)
       {
           Cliente c = new Cliente();
           c.setCelular(celular);
           c.setEndereco(endereco);
           c.setNome(nome);
           c.setRG(rg);
           c.setLivrosComprados(livrosComprados);
           c.setRevistasCompradas(revistasCompradas);
           this.listaClientes.add(c);
       } */
}

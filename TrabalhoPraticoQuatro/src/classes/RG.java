/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 * @author Rodolfo
 * @author Marcos
 * Define os metodos e parametros para o RG dos Clientes.
 */
public class RG
{
	private String sexo,dataNascimento,dataValidade,ID;
	
	public RG(String sexo,String dataNascimento,String dataValidade,String ID) 
	{
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.dataValidade = dataValidade;
		this.ID = ID;
	}
	
	public void setSexo(String s) 
	{
		this.sexo = s;
	}
	public String getSexo() 
	{
		return this.sexo;
	}
	public void setDataNascimento(String dn) 
	{
		this.dataNascimento = dn;
	}
	public String getDataNascimento() 
	{
		return this.dataNascimento;
	}
	public void setDataValidade(String dv) 
	{
		this.dataValidade = dv;
	}
	public String getDataValidade() 
	{
		return this.dataValidade;
	}
	public void setID(String ID) 
	{
		this.ID = ID;
	}
	public String getID() 
	{
		return this.ID;
	}
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * edita um RG de acordo com os par�metros passados
	 */
	public void editarRG( String nome,String sexo,String dataNascimento,String dataValidade,String ID)
	{
		this.setSexo(sexo);
		this.setDataNascimento(dataNascimento);
		this.setDataValidade(dataValidade);
		this.setID(ID);
	}
	public void mostrarRG() 
	{
		System.out.println(this.getDataNascimento() + " " + this.getDataValidade() + " " + this.getID() + " " +this.getSexo() + " ");
	}
	
}

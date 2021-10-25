/**
 * A definição de celular
 * <p>
 * Define os métodos do celular de um determinado cliente
 * @author Rodolfo
 * 
 */
package classes;

public class Celular
{
	private int ddd;
	private int numero;

	public Celular(int ddd,int numero) 
	{
		this.ddd = ddd;
		this.numero = numero;
	}
	public void setDDD(int ddd) 
	{
		this.ddd = ddd;
	}
	public int getDDD() 
	{
		return this.ddd;
	}
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	public int getNumero() 
	{
		return this.numero;
	}
	public void editarCelular(int ddd, int numero)
	{
		this.setDDD(ddd);
		this.setNumero(numero);
	}

}

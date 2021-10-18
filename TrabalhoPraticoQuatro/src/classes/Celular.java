/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

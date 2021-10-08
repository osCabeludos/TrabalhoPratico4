
package classes;

public class Endereco 
{
	private String cep,complemento,distrito,cidade,estado,lote;
	public Endereco(String cep, String complemento, String distrito, String cidade, String estado, String lote,
			int numeroCasa, int quadra) {
		
		this.cep = cep;
		this.complemento = complemento;
		this.distrito = distrito;
		this.cidade = cidade;
		this.estado = estado;
		this.lote = lote;
		this.numeroCasa = numeroCasa;
		this.quadra = quadra;
	}

	private int numeroCasa,quadra;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public int getQuadra() {
		return quadra;
	}
	public void setQuadra(int quadra) {
		this.quadra = quadra;
	}
	/**
	 * @author Rodolfo
	 * @author Marcos
	 * Edita o endereço de acordo com os parâmetros passados.
	 */
	public void editarEndereco(String cep, String complemento, String distrito, String cidade, String estado, String lote,
			int numeroCasa, int quadra) {
		
		this.setCep(cep);
		this.setComplemento(complemento);
		this.setDistrito(distrito);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setLote(lote);
		this.setNumeroCasa(numeroCasa);
		this.setQuadra(quadra);
	}
	
}
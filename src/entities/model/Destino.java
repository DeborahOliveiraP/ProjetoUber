package entities.model;

public class Destino {
	
	private String Cidade;
	private String Bairro;
	private String Logadouro;
	private String Cep;
	public Object Destino;
	
	
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		this.Bairro = bairro;
	}
	public String getLogadouro() {
		return Logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.Logadouro = logadouro;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		this.Cep = cep;
	}
	
}
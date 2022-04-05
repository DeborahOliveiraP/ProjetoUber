package dominio;



public abstract class Usuario {

	private String nome;
	private String nomeUsuario;
	private String senhaApp;
	private int id;
	private String email;
	private String senha;
	private String telefone;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaApp() {
		return senhaApp;
	}
	public void setSenhaApp(String senhaApp) {
		this.senhaApp = senhaApp;
	}
	public String getSenha() {
		return senha;
	}
	
	
	
}

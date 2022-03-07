package entities;

import java.util.Scanner;

public class Passageiro extends Usuario {
	Scanner ent = new Scanner(System.in);
	
	private String nomeU;
	private String senhaA;
	
	
	
	//Usuario cadast = new Passageiro();
	
	public String getNomeU() {
		return nomeU;
	}

	public void setNomeU(String nomeU) {
		this.nomeU = nomeU;
	}

	public String getSenhaA() {
		return senhaA;
	}

	public void setSenhaA(String senhaA) {
		this.senhaA = senhaA;
	}

	public void endereco() {
		Usuario cadast = new Passageiro();
		System.out.println("Nome: ");
		cadast.setNome(ent.next());
		System.out.println("Id: ");
		cadast.setId(ent.next());
		System.out.println("Email: ");
		cadast.setEmail(ent.next());
		
		System.out.println("Telefone: ");
		cadast.setTelefone(ent.next());
	}
	
	public void login() {
		Usuario cadast = new Passageiro();
		
		System.out.print("informe um login válido: ");
		cadast.setNomeUsuario(ent.next());
		System.out.print("insira uma senha válida: ");
		cadast.setSenhaApp(ent.next());
		
		
		
	}
	
	public void loginEfetuado() {
		
		
		System.out.print("informe um login válido: ");
		setNomeU(ent.next());
		System.out.print("insira uma senha válida: ");
		setSenhaA(ent.next());
	}

	
	
	
	

	
}

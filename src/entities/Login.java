package entities;

import java.util.Scanner;

public class Login extends Passageiro {
	Scanner ent = new Scanner(System.in);
	
	public void login() {
		Usuario cadast = new Passageiro();
		
		System.out.println("entre com um Id: ");
		cadast.setId(ent.next());
		cadast.setEmail(ent.next());
		System.out.println("Senha: ");
		
	}

}

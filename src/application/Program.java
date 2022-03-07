package application;

import java.util.Scanner;
import java.util.ArrayList;
import entities.Passageiro;
import entities.Login;

public class Program {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		ArrayList<Passageiro> usuar = new ArrayList<>();
		//ArrayList<Login> login = new ArrayList<>();
		
		Passageiro pass1 = new Passageiro();
		//Login login1 = new Login();
	
		System.out.println("====== Tela inicial de Login =====");
		System.out.println("1 Para realizar o login\n2 para se cadastra");
		System.out.println("====== ==================== =====");
		System.out.print(">>");
		int opcaoLogin = enter.nextInt();	
	
		if (opcaoLogin == 1) {
			
			pass1.loginEfetuado();
			
			
		}else if ( opcaoLogin == 2) {
			
			pass1.endereco();
			//pass1.login(); não funciona na comparação 
			
			System.out.print("Informe um usuário válido: ");
			pass1.setNomeUsuario(enter.next());
			System.out.print("Informe uma senha válid: ");
			pass1.setSenhaApp(enter.next());
			
		}

			System.out.println("========== CADASTRO REALIZADO ==========\n");
			System.out.println("realize o primeiro login");
			//pass1.loginEfetuado(); não funciona
			
			System.out.print("LOGIN: ");
			pass1.setNomeU(enter.next());
			System.out.print("SENHA: ");
			pass1.setSenhaA(enter.next());
	
			
			
			if (pass1.getNomeUsuario().equals(pass1.getNomeU())) {
				
			}
			else if (pass1.getNomeUsuario() == null || !pass1.getNomeUsuario().equals(pass1.getNomeU())) {
	                System.err.println("Usuario Incorreto.");
			 }
			
			if (pass1.getSenhaApp().equals(pass1.getSenhaA())) {
				
			}
			
			else if (pass1.getSenhaApp() == null || !pass1.getSenhaApp().equals(pass1.getSenhaA())) {
                System.err.println("Senha Incorreta");
                
			}
			
			if (pass1.getNomeUsuario().equals(pass1.getNomeU()) && pass1.getSenhaApp().equals(pass1.getSenhaA())){
	
				System.out.println("Login Correto!.....Cadastrado");
				
			}

       else {
			System.out.println("dados cadastrado errado");
		}
		
	}
}


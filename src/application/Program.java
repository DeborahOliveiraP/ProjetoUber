package application;

import java.util.Scanner;
import entities.Passageiro;

public class Program {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		Passageiro pass1 = new Passageiro();
		
		System.out.println("====== Tela inicial de Login =====");
		System.out.println("1. Para realizar o login\n2. para realizar o cadastra");
		System.out.println("====== ==================== =====");
		System.out.print(">>");
		int opcaoLogin = enter.nextInt();	
		
		if (opcaoLogin == 1) {
			
			System.out.print("LOGIN: ");
			pass1.setNomeU(enter.next());
			System.out.print("SENHA: ");
			pass1.setSenhaA(enter.next());
	
			pass1.verificarLoginUm();
			
		}else if ( opcaoLogin == 2) {
			
			pass1.endereco();
			
			
			System.out.print("Informe um usuário válido para o LOGIN: ");
			pass1.setNomeUsuario(enter.next());
			System.out.print("Informe uma senha válida: ");
			pass1.setSenhaApp(enter.next());
			System.out.println("========== CADASTRO REALIZADO ==========\n");
			System.out.println("Realize o primeiro LOGIN");
			
			System.out.print("LOGIN: ");
			pass1.setNomeU(enter.next());
			System.out.print("SENHA: ");
			pass1.setSenhaA(enter.next());
			
			pass1.verificarLogin();
			
		}
			
			
	
			
			
			System.out.println("======================================");
			System.out.println("Bem-vindo ao aplicativo Uber\n"
					+ "faça seu pedido de corrida");
			System.out.println("======================================");
			
			  
			
			boolean verdadeiro = true;
			int pergunta = 0;
			
			while (verdadeiro == true) {
				pass1.escolhaDestino(opcaoLogin);
				
				System.out.print("DESEJA REALIZAR MAIS UMA CORRIDA!?\n1.para sim\n2.para não\n>>");
				pergunta = enter.nextInt();
				if (pergunta == 1) {
					verdadeiro = true;
				}else {
					verdadeiro = false;
					System.out.print("Obrigado por ter escolhido nossos serviços");	
				}
			
			}
		
	}
}
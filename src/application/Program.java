package application;

import java.util.Scanner;
import java.util.ArrayList;
import entities.Passageiro;
import entities.Motorista;

public class Program {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		ArrayList<Passageiro> usuar = new ArrayList<>();
		
		Passageiro pass1 = new Passageiro();
		Passageiro pass2 = new Passageiro();
		Passageiro pass3 = new Passageiro();
		
		Motorista motor = new Motorista();
		
		System.out.println("====== Tela inicial de Login =====");
		System.out.println("1. Para realizar o login\n2. para realizar o cadastra");
		System.out.println("====== ==================== =====");
		System.out.print(">>");
		int opcaoLogin = enter.nextInt();	
		while (opcaoLogin !=0) {
			if (opcaoLogin == 1) {
				
				System.out.print("LOGIN: ");
				pass1.setNomeU(enter.next());
				System.out.print("SENHA: ");
				pass1.setSenhaA(enter.next());
		
				pass1.verificarLoginUm();
	
			}else if ( opcaoLogin == 2) {
				if (true) {
					if (true) {
						
						pass1.endereco();
					
						System.out.print("Informe um usuário válido para o LOGIN: ");
						pass1.setNomeUsuario(enter.next());
						System.out.print("Informe uma senha válida: ");
						pass1.setSenhaApp(enter.next());
						
						usuar.add(pass1);
						for (Passageiro pa: usuar) {
							pa.enderecoRetorno();
						}
						
						System.out.println("CONFIRME O SEU CADASTRO COM A SENHA E LOGIN");
						////////////////
						System.out.print("LOGIN: ");
						pass1.setNomeU(enter.next());
						System.out.print("SENHA: ");
						pass1.setSenhaA(enter.next());
						pass1.verificarLogin();
						System.out.println("========== CADASTRO REALIZADO ==========\n");
						////////////////////////////////////
						
						System.out.println("DESEJA REALIZAR MAIS UM CADASTRO [S/N]");
						System.out.print(">>");
						String resposta2 = enter.next();
						
						if (resposta2.equalsIgnoreCase("n")) {
							break;
						}
					
					}
				}if (true) {
					if (true) {
						
						pass2.endereco();
						System.out.print("Informe um usuário válido para o LOGIN: ");
						pass2.setNomeUsuario(enter.next());
						System.out.print("Informe uma senha válida: ");
						pass2.setSenhaApp(enter.next());
						
						usuar.add(pass2);
						for (Passageiro pa: usuar) {
							pa.enderecoRetorno();
						}
						
						System.out.println("CONFIRME O SEU CADASTRO COM A SENHA E LOGIN");
						////////////////
						System.out.print("LOGIN: ");
						pass2.setNomeU(enter.next());
						System.out.print("SENHA: ");
						pass2.setSenhaA(enter.next());
						pass2.verificarLogin();
						System.out.println("========== CADASTRO REALIZADO ==========\n");
						////////////////////////////////////
						System.out.println("DESEJA REALIZAR MAIS UM CADASTRO [S/N]");
						System.out.print(">>");
						String resposta2 = enter.next();
						
						if (resposta2.equalsIgnoreCase("n")) {
							break;
						}
					
					}
				}if (true) {
					if (true) {
						
						pass3.endereco();
						System.out.print("Informe um usuário válido para o LOGIN: ");
						pass3.setNomeUsuario(enter.next());
						System.out.print("Informe uma senha válida: ");
						pass3.setSenhaApp(enter.next());
						
						usuar.add(pass3);
						for (Passageiro pa: usuar) {
							pa.enderecoRetorno();
						}
						
						System.out.println("CONFIRME O SEU CADASTRO COM A SENHA E LOGIN");
						////////////////
						System.out.print("LOGIN: ");
						pass3.setNomeU(enter.next());
						System.out.print("SENHA: ");
						pass3.setSenhaA(enter.next());
						pass3.verificarLogin();
						System.out.println("========== CADASTRO REALIZADO ==========\n");
						////////////////////////////////////
						System.out.println("DESEJA REALIZAR MAIS UM CADASTRO [S/N]");
						System.out.print(">>");
						String resposta2 = enter.next();
						
						if (resposta2.equalsIgnoreCase("n")) {
							break;
						}
					
					}
				}
				
				
				System.out.println("DESEJA CONFIRMAR O SEU CADASTRO");
				String resposta = enter.next();
					
				if (resposta.equals("s")) {
				System.out.println("========== CADASTRO REALIZADO ==========\n");
				System.out.println("Realize o primeiro LOGIN");
				
				System.out.print("LOGIN: ");
				pass1.setNomeU(enter.next());
				System.out.print("SENHA: ");
				pass1.setSenhaA(enter.next());
				pass1.verificarLogin();
				}
			}
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
				System.out.print(">>");
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


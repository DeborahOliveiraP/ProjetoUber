package entities;

import java.util.ArrayList;
import java.util.Scanner;



public class Passageiro extends Usuario {
	Scanner ent = new Scanner(System.in);
	
	Motorista motor = new Motorista();
	Pagamento pagamento = new Pagamento();
	
	private String nomeU;
	private String senhaA;

	// ENUM
	private String escolha;
	private String origem;

	
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
		
		System.out.println("Nome: ");
		setNome(ent.nextLine());
		
		System.out.println("Idade: ");
		setId(ent.nextInt());
		
		while (getId() < 18) {
			System.out.println("IDADE ABAIXO DO PERMITIDO, PARA PROSEGUIR O USUÁRIO DEVE SER MAIOR DE IDADE ");
			setId(ent.nextInt());
		}
		
		System.out.println("Email: ");
		setEmail(ent.next());
		
		System.out.println("Telefone: ");
		setTelefone(ent.next());
	}
	
	public void enderecoRetorno() {
		System.out.println("=========== DADOS DO CADASTRO ===========");
		System.out.println("NOME DO USUÁRIO: " + getNome());
		System.out.println("IDADE: " + getId());
		System.out.println("EMAIL: " + getEmail());
		System.out.println("TELEFONE: " + getTelefone());
		System.out.println("=========================================");
	}
	
	public void loginEfetuado() {
		
		
		System.out.print("Informe um LOGIN válido: ");
		setNomeU(ent.next());
		System.out.print("Insira uma SENHA válida: ");
		setSenhaA(ent.next());
	}
	public void verificarLoginUm() {
		if(getNomeUsuario() == null) {
			
			System.out.println("USUÁRIO NÃO POSSUI AINDA UM CADASTRO");
			
		}else {
			System.out.println("USUÁRIO VÁLIDO, BEM-VINDO");
		}
		
	}
	public void verificarLogin() {
		
		boolean vdd = false;
		while (vdd == false) {
			
			
			if (getNomeUsuario().equals(getNomeU())) {
				
				if (getSenhaA().equals(getSenhaA())) {
					System.out.println("USUÁRIO VÁLIDO, BEM-VINDO");
					vdd = true;
				}
			}else {
				
				System.out.println("USUÁRIO E SENHA INCORRETA, INSIRA UM USUÁRIO VÁLIDO: ");
				loginEfetuado();
			}
		}
	}
	
	
	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	public void escolhaDestino(double orig) {
		String tipo;
		double taxa = 0;
		System.out.print("INFORME O TIPO DE UBER QUE DESEJA\n1.UBERX (R$7.20)\n2.UBERBLACK (R$9.70)\n3.UBER CONFORT (R$11.10)\n>>");
		tipo = ent.next().toUpperCase();
		switch(tipo) {
		case "1":
			System.out.println(TipoUber.UBERX);
			taxa = 7.20;
			break;
		case "2":
			System.out.println(TipoUber.UBERBLACK);
			taxa = 9.70;
			break;
		case "3":
			System.out.println(TipoUber.UBERCONFORT);
			taxa = 11.10;
			break;
		
		}

		System.out.println("======================================");
		System.out.println("INFORME QUAL BAIRRO QUE VOCÊ SE ENCONTRA");
		System.out.print("1.CENTRO\n2.MATRIZ\n3.LIVRAMENTO\n4.CAJA\n5.BELA VISTA\n6.LIDIA QUEIROZ\n>>");
		setOrigem(ent.next().toUpperCase());
		switch(getOrigem()) {
		case "1":
			System.out.println(Bairro.CENTRO);
			break;
		case "2":
			System.out.println(Bairro.MATRIZ);
			break;
		case "3":
			System.out.println(Bairro.LIVRAMENTO);
			break;
		case "4":
			System.out.println(Bairro.CAJA);
			break;
		case "5":
			System.out.println(Bairro.BELAVISTA);
			break;
		case "6":
			System.out.println(Bairro.LIDIA);
			break;
		}
		System.out.println("======================================");
		System.out.println("INFORME QUAL BAIRRO DE DESTINO");
		System.out.print("1.CENTRO\n2.MATRIZ\n3.LIVRAMENTO\n4.CAJA\n5.BELA VISTA\n6.LIDIA QUEIROZ\n>>");
		setEscolha(ent.next().toUpperCase());
		switch(getEscolha()) {
		case "1":
			System.out.println(Bairro.CENTRO);
			orig = 1.20;
			break;
		case "2":
			System.out.println(Bairro.MATRIZ);
			orig = 2.20;
			break;
		case "3":
			System.out.println(Bairro.LIVRAMENTO);
			orig = 1.90;
			break;
		case "4":
			System.out.println(Bairro.CAJA);
			orig = 1.30;
			break;
		case "5":
			System.out.println(Bairro.BELAVISTA);
			orig = 1.50;
			break;
		case "6":
			System.out.println(Bairro.LIDIA);
			orig = 1.60;
			break;
		
		}
		System.out.println("======================================");
		double totalcorrida = orig + taxa;
		System.out.println("Valor da carrida R$ " + totalcorrida);
		motor.motorista();
		pagamento.formaPagamento();
		System.out.println("======================================");
	}

}

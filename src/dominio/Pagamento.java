package dominio;

import java.util.Scanner;
import interfaces.Preco; 

public class Pagamento implements Preco {
	Scanner ent = new Scanner(System.in);
	
	
	public void formaPagamento() {
		System.out.println("======================================");
		System.out.println("ESCOLHA UMA FORMA DE PAGAMENTO");
		System.out.println("1.CART�O\n2.DINHEIRO\n3.PIX");
		
		String opcPagamento = ent.next();
		
		if (opcPagamento.equals("1")){
			System.out.println("A sua escolha de pagamento foi: CART�O");
		}else if (opcPagamento.equals("2")){
			System.out.println("A sua escolha de pagamento foi: DINHEIRO");
		}else if (opcPagamento.equals("3")){
			System.out.println("A sua escolha de pagamento foi: PIX");
		}
		
		
		
	}
	
}

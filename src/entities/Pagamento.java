package entities;

import java.util.Scanner;

public class Pagamento {
	Scanner ent = new Scanner(System.in);
	private double cartao;
	private double dinheiro;
	private double pix;
	public double getCartao() {
		return cartao;
	}
	public void setCartao(double cartao) {
		this.cartao = cartao;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public double getPix() {
		return pix;
	}
	public void setPix(double pix) {
		this.pix = pix;
	}
	
	public void formaPagamento() {
		System.out.println("======================================");
		System.out.println("ESCOLHA UMA FORMA DE PAGAMENTO");
		System.out.println("1.CARTÃO\n2.DINHEIRO\n3.PIX");
		
		String opcPagamento = ent.next();
		
		if (opcPagamento.equals("1")){
			System.out.println("A sua escolha de pagamento foi: CARTÃO");
		}else if (opcPagamento.equals("2")){
			System.out.println("A sua escolha de pagamento foi: DINHEIRO");
		}else if (opcPagamento.equals("3")){
			System.out.println("A sua escolha de pagamento foi: PIX");
		}
		
		
		
	}
	
}


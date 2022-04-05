package dominio;

import java.util.Random;
import java.util.Scanner;

public  class Motorista  {
	Scanner ent = new Scanner(System.in);
	
	private String nomeMotorista;
	private String modeloCarro;
	private String corCarro;
	private String placa;

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void motorista() {
		int motoristaAl;
		Random random = new Random();
		motoristaAl = random.nextInt(3);
		System.out.println(motoristaAl);
		switch (motoristaAl) {
		case 0:
			this.nomeMotorista = "Pedro H";
			this.modeloCarro = "Fiat Uno";
			this.corCarro = "vermelho";
			this.placa = "xxx-0000";
			break;
			
		case 1:
			this.nomeMotorista = "Guilherme V";
			this.modeloCarro = "ONIX";
			this.corCarro = "BANCO";
			this.placa = "YYY-1111";
			break;
		case 2:
			this.nomeMotorista = "Joao V ";
			this.modeloCarro = "FOX";
			this.corCarro = "PRETO";
			this.placa = "WWW-333";
			break;
	
		}
		System.out.println("NOME DO MOTORISTA: " + this.nomeMotorista);
		System.out.println("MODELO DO CARRO: " + this.modeloCarro);
		System.out.println("COR DO CARRO: " + this.corCarro);
		System.out.println("PLACA: " + this.placa);
		
		
	
	}
	
}
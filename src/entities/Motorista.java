package entities;

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
		switch (motoristaAl) {
		case 0:
			this.nomeMotorista = "pedro h";
			this.modeloCarro = "Fiat Uno";
			this.corCarro = "vermelho";
			this.placa = "xxx-0000";
			break;
		case 1:
			this.nomeMotorista = "GUILHERME";
			this.modeloCarro = "ONIX";
			this.corCarro = "BRANCO";
			this.placa = "YYY-1111";
		case 2:
			this.nomeMotorista = "JOÃO";
			this.modeloCarro = "FOX";
			this.corCarro = "PRETO";
			this.placa = "WWW-333";
	
		}
		System.out.println("NOME DO MOTORISTA " + nomeMotorista);
		System.out.println("MODELO DO CARRO " + modeloCarro);
		System.out.println("COR DO CARRO " + corCarro);
		System.out.println("PLACA " + placa);
	
	}
}
	



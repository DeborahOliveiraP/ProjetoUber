package entities;

import entities.model.Destino;
import entities.model.Usuario;

public class Corrida {

	private Destino destino;
	private Usuario motorista;
	private Usuario passageiro;
	private Pagamento pagamento;
	private String status; 
	private int id;
	
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public Usuario getMotorista() {
		return motorista;
	}
	public void setMotorista(Usuario motorista) {
		this.motorista = motorista;
	}
	public Usuario getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Usuario passageiro) {
		this.passageiro = passageiro;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
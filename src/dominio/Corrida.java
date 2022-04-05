package dominio;
import interfaces.Pagamento;

public class Corrida {

	private Destino destino;
	private Usuario motorista;
	private Usuario passageiro;
	private Pagamento pagamento;
	
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
	
	
}

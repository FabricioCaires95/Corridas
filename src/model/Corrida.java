package model;

public class Corrida {

	private Integer id; 
	private Double valor;
	private Passageiro passageiro; 
	private Motorista motorista;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public Motorista getMotorista() {
		return motorista;
	}
	
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
	
	
	
}

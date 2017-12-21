package model;

import java.sql.Date;

public class Motorista {

	private Integer id; 
	private String nome , cpf , sexo , modeloCarro, status; 
	private Date nascimento;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getModeloCarro() {
		return modeloCarro;
	}
	
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	} 
	
	
	
	
	
}

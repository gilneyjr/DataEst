package com.dataest.model;

public class ParticipanteEstatistica {
	private Integer codigo;
	private String nome;
	private String instituicao;
	private String email;
	private String cpf;
	public ParticipanteEstatistica() {
		/* Nothing */
	}
	public ParticipanteEstatistica(Integer codigo, String nome, String instituicao, String email, String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.instituicao = instituicao;
		this.email = email;
		this.cpf = cpf;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

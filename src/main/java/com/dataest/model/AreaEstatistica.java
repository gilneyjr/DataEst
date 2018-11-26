package com.dataest.model;

public class AreaEstatistica {
	private Integer codigo;
	private String nome;
	private String cidade;
	private String estado;
	private String pais;
	public AreaEstatistica() {
		/* Nothing */
	}
	public AreaEstatistica(Integer codigo, String nome, String cidade, String estado, String pais) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}

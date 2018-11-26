package com.dataest.model;

public class Arquivo {
	private Integer codigo;
	private String nome;
	private String tipo;
	private Long tamanho;
	private byte[] dados;
	private ProjetoEstatistica projeto;
	private PraticaEstatistica pratica;
	public Arquivo() {
		/* Nothing */
	}
	public Arquivo(Integer codigo, String nome, String tipo, Long tamanho, byte[] dados, ProjetoEstatistica projeto,
			PraticaEstatistica pratica) {
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.dados = dados;
		this.projeto = projeto;
		this.pratica = pratica;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getTamanho() {
		return tamanho;
	}
	public void setTamanho(Long tamanho) {
		this.tamanho = tamanho;
	}
	public byte[] getDados() {
		return dados;
	}
	public void setDados(byte[] dados) {
		this.dados = dados;
	}
	public ProjetoEstatistica getProjeto() {
		return projeto;
	}
	public void setProjeto(ProjetoEstatistica projeto) {
		this.projeto = projeto;
	}
	public PraticaEstatistica getPratica() {
		return pratica;
	}
	public void setPratica(PraticaEstatistica pratica) {
		this.pratica = pratica;
	}
}

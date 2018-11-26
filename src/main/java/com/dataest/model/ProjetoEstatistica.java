package com.dataest.model;

import java.sql.Date;
import java.util.List;

public class ProjetoEstatistica {
	private Integer codigo;
	private String nome;
	private Date dataInicio;
	private Date dataTermino;
	private List<ParticipanteEstatistica> participantes;
	private String orgao;
	private String coordenador;
	public ProjetoEstatistica() {
		/* Nothing */
	}
	public ProjetoEstatistica(Integer codigo, String nome, Date dataInicio, Date dataTermino,
			List<ParticipanteEstatistica> participantes, String orgao, String coordenador) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.participantes = participantes;
		this.orgao = orgao;
		this.coordenador = coordenador;
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public List<ParticipanteEstatistica> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<ParticipanteEstatistica> participantes) {
		this.participantes = participantes;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public String getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
}

package com.dataest.model;

import java.sql.Date;
import java.util.List;

public class PraticaEstatistica {
	private Integer codigo;
	private Date dataInicio;
	private Date dataTermino;
	private AreaEstatistica area;
	private ProjetoEstatistica projeto;
	private List<ParticipanteEstatistica> participantes;
	public PraticaEstatistica() {
		/* Nothing */
	}
	public PraticaEstatistica(Integer codigo, Date dataInicio, Date dataTermino, AreaEstatistica area,
			ProjetoEstatistica projeto, List<ParticipanteEstatistica> participantes) {
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.area = area;
		this.projeto = projeto;
		this.participantes = participantes;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	public AreaEstatistica getArea() {
		return area;
	}
	public void setArea(AreaEstatistica area) {
		this.area = area;
	}
	public ProjetoEstatistica getProjeto() {
		return projeto;
	}
	public void setProjeto(ProjetoEstatistica projeto) {
		this.projeto = projeto;
	}
	public List<ParticipanteEstatistica> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<ParticipanteEstatistica> participantes) {
		this.participantes = participantes;
	}
}

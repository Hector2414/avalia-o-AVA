package com.sesi.Projeto_Ava.model;

import java.util.Date;

public class Tarefa {

	private String titulo;
	private String descricao;
	private Date dataCriacao;
	
	public enum Status{
		CONCLUIDA,ABERTA, ATRASADO
	}
	
	public String criarTarefa() {
		return"criar";
	}
	
	public  String excluirTarefa() {
		return"excluir";
	}
	
	public String atualizarTarefa() {
		return"atualizar";
	}

	
	
	
	
	
	
	
	
	public Tarefa() {
		
	}

	public Tarefa(String titulo, String descricao, Date dataCriacao) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

		
	
	
	
}

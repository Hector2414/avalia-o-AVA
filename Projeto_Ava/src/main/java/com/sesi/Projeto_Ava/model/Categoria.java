package com.sesi.Projeto_Ava.model;

public class Categoria {

	private String nome;
	private String descricao;
	
	
	private int id;
	
	
	
	
	public String adicionar() {
		return"adicionar";
	}
	
	public String remover() {
		return"remover";
	}
	
	
	
	
	
	
	
	

	public Categoria() {
		
	}

	public Categoria(String nome, String descricao, int id) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}

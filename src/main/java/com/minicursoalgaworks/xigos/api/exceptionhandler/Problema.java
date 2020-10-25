package com.minicursoalgaworks.xigos.api.exceptionhandler;

import java.time.LocalDateTime;

/*Classe para montar o padrão da resposta de erro*/
public class Problema {
	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}

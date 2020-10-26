package com.minicursoalgaworks.xigos.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class OrdemServico {
	private Long id;
	private Cliente cliente;
	private String descricao;
	private BigDecimal preco;
	private StatusOrdemServico status;
}

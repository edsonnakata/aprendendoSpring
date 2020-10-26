package com.minicursoalgaworks.xigos.domain.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minicursoalgaworks.xigos.domain.model.OrdemServico;
import com.minicursoalgaworks.xigos.domain.model.StatusOrdemServico;
import com.minicursoalgaworks.xigos.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(LocalDateTime.now());
		
		return ordemServicoRepository.save(ordemServico);
	}
	
	
}

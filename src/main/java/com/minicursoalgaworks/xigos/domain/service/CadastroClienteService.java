package com.minicursoalgaworks.xigos.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minicursoalgaworks.xigos.domain.exception.NegocioException;
import com.minicursoalgaworks.xigos.domain.model.Cliente;
import com.minicursoalgaworks.xigos.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {
	@Autowired
	private ClienteRepository clienteRep;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = clienteRep.findByEmail(cliente.getEmail());
		if (clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este e-mail.");
		}
		
		return clienteRep.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRep.deleteById(clienteId);
	}
}

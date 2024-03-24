package br.edu.infnet.alicesilva.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.alicesilva.clients.IEnderecoClient;
import br.edu.infnet.alicesilva.model.domain.Endereco;

@Service
public class LocalidadeService {
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}

package br.edu.infnet.alicesilva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.alicesilva.model.domain.Endereco;
import br.edu.infnet.alicesilva.model.service.EnderecoService;
import br.edu.infnet.alicesilva.model.service.LocalidadeService;

@Component
public class EnderecoLoader implements ApplicationRunner{
	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Endereco endereco3 = localidadeService.obterPorCep("01310930");
		enderecoService.incluir(endereco3);
		
		Endereco endereco1 = new Endereco("1234", "logradouro", "complemento", "bairro", "localidade", "uf");
		System.out.println("endereço: " + endereco1);
		Endereco endereco2 = new Endereco("12345", "logradouro2", "complemento2", "bairro2", "localidade2", "uf2");
		System.out.println("endereço: " + endereco2);
		System.out.println("endereço 3: " + endereco3);
	}
	
}

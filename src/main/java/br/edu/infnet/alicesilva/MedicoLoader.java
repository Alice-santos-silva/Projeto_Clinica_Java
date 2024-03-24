package br.edu.infnet.alicesilva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.alicesilva.model.domain.Endereco;
import br.edu.infnet.alicesilva.model.domain.Medico;
import br.edu.infnet.alicesilva.model.service.LocalidadeService;
import br.edu.infnet.alicesilva.model.service.MedicoService;

@Component
public class MedicoLoader implements ApplicationRunner{
	@Autowired
	private LocalidadeService localidadeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Endereco enderecoMedico = new Endereco("1234567", "logradouro3", "complemento3", "bairro3", "localidade3", "uf3");
		MedicoService medicoService = new MedicoService();
		Endereco enderecoMedico2 = localidadeService.obterPorCep("01310930");
		medicoService.incluir(new Medico("Alice", "Cardiologista", "9h às 14h", 150, enderecoMedico));
		
		medicoService.excluir("Alice");
		
		medicoService.incluir(new Medico("Gabriel", "Cardiologista", "10h às 15h", 150, enderecoMedico2));
		
		System.out.println(medicoService.obterMedico("Gabriel")); 
	}
	
}

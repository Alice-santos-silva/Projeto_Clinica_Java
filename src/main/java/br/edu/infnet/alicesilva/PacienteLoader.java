package br.edu.infnet.alicesilva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.alicesilva.model.domain.Endereco;
import br.edu.infnet.alicesilva.model.domain.Paciente;
import br.edu.infnet.alicesilva.model.service.LocalidadeService;
import br.edu.infnet.alicesilva.model.service.PacienteService;

@Component
public class PacienteLoader implements ApplicationRunner{
	@Autowired
	private LocalidadeService localidadeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Endereco enderecoPaciente = localidadeService.obterPorCep("21031680");
		Endereco enderecoPaciente2 = localidadeService.obterPorCep("01310930");
				
		PacienteService pacienteService = new PacienteService();
		
		
		pacienteService.incluir(new Paciente("Henrique", "3445566", enderecoPaciente));
		pacienteService.incluir(new Paciente("Luiza", "267890", enderecoPaciente2));

		System.out.println(pacienteService.obterPaciente("Henrique"));
		System.out.println(pacienteService.obterPaciente("Luiza"));
		System.out.println("--" + pacienteService.listaPacientes());
		
	}

}

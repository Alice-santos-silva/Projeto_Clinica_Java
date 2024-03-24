package br.edu.infnet.alicesilva.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.alicesilva.model.domain.Medico;
import br.edu.infnet.alicesilva.model.service.MedicoService;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {
	
	@Autowired
	private MedicoService medicoService;
	
	@PostMapping(value = "/incluirmedico")
	public void incluir(@RequestBody Medico medico) {
		medicoService.incluir(medico);
		 
	}
	
	@DeleteMapping(value = "/{nome}/deletarmedico")
	public void excluir(@PathVariable String nome) {
		medicoService.excluir(nome);
	}
	
	@GetMapping(value = "/listarmedicos")
	public Collection<Medico> listaMedicos(){
		return medicoService.listaMedicos();
	} 
	@GetMapping(value = "/{nome}/obtermedico")
	public Medico obterMedico(@PathVariable String nome) {
		return medicoService.obterMedico(nome);
	}
}

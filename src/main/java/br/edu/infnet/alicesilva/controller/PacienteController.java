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

import br.edu.infnet.alicesilva.model.domain.Paciente;
import br.edu.infnet.alicesilva.model.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping(value = "/incluirpaciente")
	public void incluir(@RequestBody Paciente paciente) {
		pacienteService.incluir(paciente);
		 
	}
	
	@DeleteMapping(value = "/{nome}/deletarpaciente")
	public void excluir(@PathVariable String nome) {
		pacienteService.excluir(nome);
	}
	
	@GetMapping(value = "/listarpacientes")
	public Collection<Paciente> listaPacientes(){
		return pacienteService.listaPacientes();
	} 
	@GetMapping(value = "/{nome}/obterpaciente")
	public Paciente obterPaciente(@PathVariable String nome) {
		return pacienteService.obterPaciente(nome);
	}
}

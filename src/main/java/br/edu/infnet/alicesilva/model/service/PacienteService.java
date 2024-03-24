package br.edu.infnet.alicesilva.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.alicesilva.model.domain.Paciente;

@Service
public class PacienteService {
	private static Map<String, Paciente> pacientes = new HashMap<String, Paciente>();
	
	public void incluir(Paciente paciente) {
		pacientes.put(paciente.getNome(), paciente);
		
	}
	public void excluir(String nome) {
		pacientes.remove(nome);
	}
	
	public Collection<Paciente> listaPacientes(){
		return pacientes.values();
	} 
	
	public Paciente obterPaciente(String nome) {
		return pacientes.get(nome);
	}
}

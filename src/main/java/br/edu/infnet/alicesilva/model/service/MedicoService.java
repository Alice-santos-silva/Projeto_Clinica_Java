package br.edu.infnet.alicesilva.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.alicesilva.model.domain.Medico;

@Service
public class MedicoService {
	private static Map<String, Medico> medicos = new HashMap<String, Medico>();
	
	public void incluir(Medico medico) {
		medicos.put(medico.getNome(), medico);
		
	}
	public void excluir(String nome) {
		medicos.remove(nome);
	}
	
	public Collection<Medico> listaMedicos(){
		return medicos.values();
	}
	
	public Medico obterMedico(String nome) {
		return medicos.get(nome);
	}
}


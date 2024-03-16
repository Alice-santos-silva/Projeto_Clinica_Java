package br.edu.infnet.alicesilva.model.domain;

public class Paciente {
	private String nome;
	private int idade;
	private int numeroProntuario;
	private boolean possuiConvenio;
	private String dataTratamento;
	private float consultaCG;
	private float consultaCardiologista;

	public boolean solicitarConsulta() {
        return numeroProntuario > 0 && idade > 10;
    }
	
	public float descontoClinicoGeral() {
	    consultaCG = possuiConvenio ? 60 : 100;
	    return consultaCG;
	} 

	public float descontoCardiologista() {
	    consultaCardiologista = possuiConvenio ? 90 : 150;
	    return consultaCardiologista;
	}

	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getConsultaCG() {
		return consultaCG;
	}

	public void setConsultaCG(float consultaCG) {
		this.consultaCG = consultaCG;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(int numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public boolean isPossuiConvenio() {
		return possuiConvenio;
	}
	public void setPossuiConvenio(boolean possuiConvenio) {
		this.possuiConvenio = possuiConvenio;
	}
	public String getDataTratamento() {
		return dataTratamento;
	}
	public void setDataTratamento(String dataTratamento) {
		this.dataTratamento = dataTratamento;
	}
	public float getConsultaCardiologista() {
		return consultaCardiologista;
	}

	public void setConsultaCardiologista(float consultaCardiologista) {
		this.consultaCardiologista = consultaCardiologista;
	}
	
}

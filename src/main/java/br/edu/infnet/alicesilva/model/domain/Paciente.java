package br.edu.infnet.alicesilva.model.domain;

public class Paciente {
	private String nome;
	private int idade;
	private Endereco endereco;
	private String numeroProntuario;
	private boolean possuiConvenio;
	/*private String dataTratamento;*/
	private float consultaCG;
	private float consultaCardiologista;
	
	public Paciente(String nome) {
		this.setNome(nome);
	}
	 
	public Paciente(String nome, String numeroProntuario, Endereco endereco) {
		this.setNome(nome);
		this.setNumeroProntuario(numeroProntuario);
		this.setEndereco(endereco);
	}
	
	@Override
	public String toString(){
		return "Nome do paciente: " + nome + " Endereço: " + endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean solicitarConsulta() {
        return idade > 10;
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
	public String getNumeroProntuario() {
		return numeroProntuario;
	}
	public void setNumeroProntuario(String numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}
	public boolean isPossuiConvenio() {
		return possuiConvenio;
	}
	public void setPossuiConvenio(boolean possuiConvenio) {
		this.possuiConvenio = possuiConvenio;
	}
	/*public String getDataTratamento() {
		return getDataTratamento();
	}
	public void setDataTratamento(String dataTratamento) {
		this.dataTratamento = dataTratamento;
	}*/
	public float getConsultaCardiologista() {
		return consultaCardiologista;
	}

	public void setConsultaCardiologista(float consultaCardiologista) {
		this.consultaCardiologista = consultaCardiologista;
	}
	
}

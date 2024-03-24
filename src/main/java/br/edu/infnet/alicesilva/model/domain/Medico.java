package br.edu.infnet.alicesilva.model.domain;
/*import java.util.Date;*/

public class Medico {
	private String nome;
    private String especialidade;
    private String horarioTrabalho;
    private float valorConsulta;
    private Endereco endereco;
    
    public Medico(String nome, String especialidade, String horarioTrabalho, float valorConsulta, Endereco endereco) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
        this.valorConsulta = valorConsulta;
        this.setEndereco(endereco);
    }
    
    @Override
	public String toString(){
		return "Nome do médico: " + nome + " Endereço: " + endereco;
	}

	/*public void agendarConsulta(Date dataHoraConsulta, Paciente paciente) {
    	System.out.println("Consulta agendada com sucesso para o médico " + this.nome + " no dia " + dataHoraConsulta + " para o paciente " + paciente.getNome());
    }*/
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getHorarioTrabalho() {
		return horarioTrabalho;
	}
	public void setHorarioTrabalho(String horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}
	
	public float getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(float valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

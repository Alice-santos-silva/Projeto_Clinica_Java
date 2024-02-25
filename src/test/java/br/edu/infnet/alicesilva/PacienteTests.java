package br.edu.infnet.alicesilva;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.alicesilva.model.domain.Paciente;
public class PacienteTests {
	private Paciente pacientePadrao;
	
	private final String NOME = "Alice";
	private final String DATATRATAMENTO = "02/2024";
	
	@BeforeEach
	void setUp() {
		pacientePadrao = new Paciente();
		pacientePadrao.setNome(NOME);
		pacientePadrao.setDataTratamento(DATATRATAMENTO);
		pacientePadrao.setPossuiConvenio(false);
	}
	 
	@Test
	void possuiProntuario() {
		pacientePadrao.setNumeroProntuario(2024001);
		assertEquals(2024001, pacientePadrao.getNumeroProntuario());
	}
	
	@Test
    void testSolicitarConsulta() {
        pacientePadrao.setIdade(20);
        pacientePadrao.setNumeroProntuario(2024001);
        assertTrue(pacientePadrao.solicitarConsulta());
    }

    @Test
    void testSolicitarConsultaMenorIdade() {
        pacientePadrao.setIdade(10);
        pacientePadrao.setNumeroProntuario(2024001);
        assertFalse(pacientePadrao.solicitarConsulta());
    }

    @Test
    void testDescontoClinicoGeralComConvenio() {
        pacientePadrao.setPossuiConvenio(true);
        assertEquals(60, pacientePadrao.descontoClinicoGeral());
    }
 
    @Test
    void testDescontoClinicoGeralSemConvenio() {
        assertEquals(100, pacientePadrao.descontoClinicoGeral());
    }

    @Test
    void testDescontoCardiologistaComConvenio() {
        pacientePadrao.setPossuiConvenio(true);
        assertEquals(90, pacientePadrao.descontoCardiologista());
    }

    @Test
    void testDescontoCardiologistaSemConvenio() {
        assertEquals(150, pacientePadrao.descontoCardiologista());
    }
}

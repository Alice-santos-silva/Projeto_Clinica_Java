package br.edu.infnet.alicesilva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.alicesilva.model.domain.Medico;

public class MedicoTests {
    private Medico medicoPadrao;

    private final String NOME = "Dr. João";
    private final String ESPECIALIDADE = "Clínico Geral";
    private final String HORARIO_TRABALHO = "Segunda-feira, das 08:00 às 12:00";
    private final float VALOR_CONSULTA = 100.0f;

    @BeforeEach
    void setUp() {
        medicoPadrao = new Medico(NOME, ESPECIALIDADE, HORARIO_TRABALHO, VALOR_CONSULTA, null);
    }

    @Test
    void testGetNome() {
        assertEquals(NOME, medicoPadrao.getNome());
    }

    @Test
    void testGetEspecialidade() {
        assertEquals(ESPECIALIDADE, medicoPadrao.getEspecialidade());
    }

    @Test
    void testGetHorarioTrabalho() {
        assertEquals(HORARIO_TRABALHO, medicoPadrao.getHorarioTrabalho());
    }

    @Test
    void testGetValorConsulta() {
        assertEquals(VALOR_CONSULTA, medicoPadrao.getValorConsulta());
    }

    @Test
    void testSetNome() {
        String novoNome = "Dr. Pedro";
        medicoPadrao.setNome(novoNome);
        assertEquals(novoNome, medicoPadrao.getNome());
    }

    @Test
    void testSetEspecialidade() {
        String novaEspecialidade = "Cardiologista";
        medicoPadrao.setEspecialidade(novaEspecialidade);
        assertEquals(novaEspecialidade, medicoPadrao.getEspecialidade());
    }

    @Test
    void testSetHorarioTrabalho() {
        String novoHorarioTrabalho = "Terça-feira, das 14:00 às 18:00";
        medicoPadrao.setHorarioTrabalho(novoHorarioTrabalho);
        assertEquals(novoHorarioTrabalho, medicoPadrao.getHorarioTrabalho());
    }

    @Test
    void testSetValorConsulta() {
        float novoValorConsulta = 120.0f;
        medicoPadrao.setValorConsulta(novoValorConsulta);
        assertEquals(novoValorConsulta, medicoPadrao.getValorConsulta());
    }
}

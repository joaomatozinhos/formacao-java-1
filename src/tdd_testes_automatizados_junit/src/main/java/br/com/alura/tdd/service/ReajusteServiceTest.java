package tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Desempenho;
import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializa() {
		System.out.println("início do teste");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Fernando", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@AfterEach
	public void finaliza() {
		System.out.println("fim do teste");
	}

	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("INÍCIO");
	}

	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("FIM");
	}

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		service.concedeReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
		service.concedeReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}

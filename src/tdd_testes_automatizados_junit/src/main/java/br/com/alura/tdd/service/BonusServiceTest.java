package tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();

//		try {
//			service.calculaBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
//			fail("Não deu a exception!");
//		} catch (Exception e) {
//			assertEquals("Funcionario com salario maior do que R$10000 nao pode receber bonus!", e.getMessage());
//		}

		assertThrows(IllegalArgumentException.class,
				() -> service.calculaBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000.00"))));
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calculaBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500.00")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSer10PorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service
				.calculaBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000.00")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}

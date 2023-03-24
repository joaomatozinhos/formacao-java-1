package tdd_testes_automatizados_junit.src.test.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.sum(3, 7);

		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.sum(4283, -32497);
		
		Assert.assertEquals(-28214, soma);
	}
}

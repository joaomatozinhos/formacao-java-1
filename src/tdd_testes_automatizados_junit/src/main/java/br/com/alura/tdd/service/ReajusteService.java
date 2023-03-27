package tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Desempenho;
import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
		if (desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustaSalario(reajuste);
		}
	}

}

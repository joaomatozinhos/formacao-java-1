package tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Desempenho;
import tdd_testes_automatizados_junit.src.main.java.br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustaSalario(reajuste);
	}
}

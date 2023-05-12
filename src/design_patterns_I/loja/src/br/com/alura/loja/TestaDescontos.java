package design_patterns_I.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.desconto.CalculadoraDeDesconto;
import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("400"), 8);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("750"), 4);

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcula(segundoOrcamento));

	}

}

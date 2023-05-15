package design_patterns_I.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.desconto.CalculadoraDeDesconto;
import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		Orcamento terceiroOrcamento = new Orcamento(new BigDecimal("100"), 1);

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcula(primeiroOrcamento));
		System.out.println(calculadora.calcula(segundoOrcamento));
		System.out.println(calculadora.calcula(terceiroOrcamento));

	}

}

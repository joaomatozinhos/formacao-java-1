package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.desconto.CalculadoraDeDesconto;
import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaDescontos {

	public static void main(String[] args) {
		Orcamento primeiroOrcamento = new Orcamento();
		primeiroOrcamento.adicionaItem(new ItemOrcamento(new BigDecimal("200")));

		Orcamento segundoOrcamento = new Orcamento();
		segundoOrcamento.adicionaItem(new ItemOrcamento(new BigDecimal("1000")));
		
		Orcamento terceiroOrcamento = new Orcamento();
		terceiroOrcamento.adicionaItem(new ItemOrcamento(new BigDecimal("500")));

		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcula(primeiroOrcamento));
		System.out.println(calculadora.calcula(segundoOrcamento));
		System.out.println(calculadora.calcula(terceiroOrcamento));

	}

}

package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.imposto.CalculadoraDeImposto;
import design_patterns.loja.src.br.com.alura.loja.imposto.ICMS;
import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		System.out.println(calculadora.calcula(orcamento, new ICMS(null)));

	}

}

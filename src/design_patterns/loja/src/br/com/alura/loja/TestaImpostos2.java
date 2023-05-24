package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.imposto.CalculadoraDeImposto;
import design_patterns.loja.src.br.com.alura.loja.imposto.ICMS;
import design_patterns.loja.src.br.com.alura.loja.imposto.ISS;
import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaImpostos2 {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

		System.out.println(calculadoraDeImposto.calcula(orcamento, new ICMS(new ISS(null))));

	}

}

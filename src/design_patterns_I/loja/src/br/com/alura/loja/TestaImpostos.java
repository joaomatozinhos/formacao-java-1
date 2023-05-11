package design_patterns_I.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.imposto.CalculadoraDeImposto;
import design_patterns_I.loja.src.br.com.alura.loja.imposto.TipoImposto;
import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		System.out.println(calculadora.calcula(orcamento, TipoImposto.ICMS));

	}

}

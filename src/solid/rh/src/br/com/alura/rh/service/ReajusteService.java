package solid.rh.src.br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import solid.rh.src.br.com.alura.rh.ValidacaoException;
import solid.rh.src.br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	public void reajustaSalario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		BigDecimal salarioNovo = salarioAtual.add(aumento);
		funcionario.atualizaSalario(salarioNovo);
	}

}

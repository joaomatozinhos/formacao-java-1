package solid.rh.src.br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import solid.rh.src.br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustaSalario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.valida(funcionario, aumento));

		BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
		BigDecimal salarioNovo = salarioAtual.add(aumento);
		funcionario.atualizaSalario(salarioNovo);
	}

}

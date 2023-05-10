package solid.rh.src.br.com.alura.rh.service.promocao;

import solid.rh.src.br.com.alura.rh.ValidacaoException;
import solid.rh.src.br.com.alura.rh.model.Cargo;
import solid.rh.src.br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promove(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if (cargoAtual == Cargo.GERENTE) {
			throw new ValidacaoException("Gerente não pode ser promovido!");
		}

		if (metaBatida) {
			Cargo cargoNovo = cargoAtual.getProximoCargo();
			funcionario.promove(cargoNovo);
		} else {
			throw new ValidacaoException("Funcionário não atingiu a meta!");
		}
	}

}

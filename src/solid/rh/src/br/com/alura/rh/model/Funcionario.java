package solid.rh.src.br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void atualizaSalario(BigDecimal salarioNovo) {
		this.dadosPessoais.setSalario(salarioNovo);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promove(Cargo cargoNovo) {
		this.dadosPessoais.setCargo(cargoNovo);
	}

}

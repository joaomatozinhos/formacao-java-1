package jdbc.src.main.java.br.com.alura.bytebank.domain.conta;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Set;

import jdbc.src.main.java.br.com.alura.bytebank.ConnectionFactory;
import jdbc.src.main.java.br.com.alura.bytebank.domain.RegraDeNegocioException;

public class ContaService {

	private ConnectionFactory connection;

	public ContaService() {
		this.connection = new ConnectionFactory();
	}

	public Set<Conta> listarContasAbertas() {
		Connection con = connection.recuperaConexao();
		return new ContaDAO(con).lista();
	}

	public Conta buscaContaPorNumero(Integer numeroDaConta) {
		Connection con = connection.recuperaConexao();
		Conta conta = new ContaDAO(con).buscaPorNumero(numeroDaConta);

		if (conta != null) {
			return conta;
		} else {
			throw new RegraDeNegocioException("Não existe conta cadastrada com esse número!");
		}
	}

	public BigDecimal consultarSaldo(Integer numeroDaConta) {
		var conta = buscaContaPorNumero(numeroDaConta);
		return conta.getSaldo();
	}

	public void abrir(DadosAberturaConta dadosDaConta) {
		Connection con = connection.recuperaConexao();
		new ContaDAO(con).salva(dadosDaConta);
	}

	public void realizarDeposito(Integer numeroDaConta, BigDecimal valor) {
		var conta = buscaContaPorNumero(numeroDaConta);
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new RegraDeNegocioException("Valor do deposito deve ser superior a zero!");
		}

		BigDecimal novoValor = conta.getSaldo().add(valor);
		alteraSaldo(conta, novoValor);
	}

	public void realizarSaque(Integer numeroDaConta, BigDecimal valor) {
		var conta = buscaContaPorNumero(numeroDaConta);
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new RegraDeNegocioException("Valor do saque deve ser superior a zero!");
		}

		if (valor.compareTo(conta.getSaldo()) > 0) {
			throw new RegraDeNegocioException("Saldo insuficiente!");
		}

		BigDecimal novoValor = conta.getSaldo().subtract(valor);
		alteraSaldo(conta, novoValor);
	}

	public void realizarTransferencia(Integer numeroDaContaOrigem, Integer numeroDaContaDestino, BigDecimal valor) {
		this.realizarSaque(numeroDaContaOrigem, valor);
		this.realizarDeposito(numeroDaContaDestino, valor);
	}

	public void encerrar(Integer numeroDaConta) {
		var conta = buscaContaPorNumero(numeroDaConta);
		if (conta.possuiSaldo()) {
			throw new RegraDeNegocioException("Conta não pode ser encerrada pois ainda possui saldo!");
		}

		Connection con = connection.recuperaConexao();
		new ContaDAO(con).deleta(numeroDaConta);
	}

	private void alteraSaldo(Conta conta, BigDecimal valor) {
		Connection con = connection.recuperaConexao();
		new ContaDAO(con).alteraSaldo(conta.getNumero(), valor);
	}
}

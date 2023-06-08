package jdbc.src.main.java.br.com.alura.bytebank.domain.conta;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import jdbc.src.main.java.br.com.alura.bytebank.domain.cliente.Cliente;
import jdbc.src.main.java.br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

public class ContaDAO {

	private Connection con;

	public ContaDAO(Connection connection) {
		this.con = connection;
	}

	public void salva(DadosAberturaConta dadosDaConta) {
		var cliente = new Cliente(dadosDaConta.dadosCliente());
		var conta = new Conta(dadosDaConta.numero(), BigDecimal.ZERO, cliente);

		String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email)"
				+ "VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setInt(1, conta.getNumero());
			preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
			preparedStatement.setString(3, dadosDaConta.dadosCliente().nome());
			preparedStatement.setString(4, dadosDaConta.dadosCliente().cpf());
			preparedStatement.setString(5, dadosDaConta.dadosCliente().email());

			preparedStatement.execute();
			preparedStatement.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Set<Conta> lista() {
		Set<Conta> contas = new HashSet<>();

		String sql = "SELECT * FROM conta";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer numero = resultSet.getInt(1);
				BigDecimal saldo = resultSet.getBigDecimal(2);
				String nome = resultSet.getString(3);
				String cpf = resultSet.getString(4);
				String email = resultSet.getString(5);

				DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
				Cliente cliente = new Cliente(dadosCadastroCliente);

				contas.add(new Conta(numero, saldo, cliente));
			}

			resultSet.close();
			preparedStatement.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return contas;

	}

	public Conta buscaPorNumero(Integer numeroDaConta) {
		Conta conta = null;
		String sql = "SELECT * FROM conta WHERE numero = ?";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setInt(1, numeroDaConta);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Integer numero = resultSet.getInt(1);
				BigDecimal saldo = resultSet.getBigDecimal(2);
				String nome = resultSet.getString(3);
				String cpf = resultSet.getString(4);
				String email = resultSet.getString(5);

				DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
				Cliente cliente = new Cliente(dadosCadastroCliente);

				conta = new Conta(numero, saldo, cliente);
			}

			resultSet.close();
			preparedStatement.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return conta;

	}

	public void alteraSaldo(Integer numeroDaConta, BigDecimal valor) {
		String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setBigDecimal(1, valor);
			preparedStatement.setInt(2, numeroDaConta);

			preparedStatement.execute();
			preparedStatement.close();
			con.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
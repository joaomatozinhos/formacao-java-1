package jdbc.src.main.java.br.com.alura.bytebank.domain.conta;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.src.main.java.br.com.alura.bytebank.domain.cliente.Cliente;

public class ContaDAO {

	private Connection con;

	public ContaDAO(Connection connection) {
		this.con = connection;
	}

	public void salva(DadosAberturaConta dadosDaConta) {
		var cliente = new Cliente(dadosDaConta.dadosCliente());
		var conta = new Conta(dadosDaConta.numero(), cliente);

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
}

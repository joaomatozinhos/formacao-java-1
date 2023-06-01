package jdbc.src.main.java.br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/byte_bank?user=root&password=root");

			System.out.println("Conexão iniciada.");

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}

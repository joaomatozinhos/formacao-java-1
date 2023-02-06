package excecoes.pilha.src;

public class TestaConexao {

	public static void main(String[] args) {

		Conexao c = new Conexao();

		try {
			c.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro na conexão.");
		} finally {
			c.fecha();
		}

	}

}

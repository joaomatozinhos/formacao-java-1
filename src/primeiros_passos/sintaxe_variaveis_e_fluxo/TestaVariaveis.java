package primeiros_passos.sintaxe_variaveis_e_fluxo;

public class TestaVariaveis {

	public static void main(String[] args) {
		System.out.println("variaveis");

		int idadeDoUsuario = 21;

		String nomeDoUsuario = "João Pedro";

		System.out.println(nomeDoUsuario + " tem " + idadeDoUsuario + " anos.");

		idadeDoUsuario = (10 * 5) + 2;
		nomeDoUsuario = "Cláudio";

		System.out.println(nomeDoUsuario + " tem " + idadeDoUsuario + " anos.");
	}

}

package polimorfismo_heranca_interface.bytebank_heranca.src;

public class SistemaInterno {

	private String senha = "ab8812";

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acesso permitido. Bem vindo!");
		} else {
			System.out.println("Acesso negado.");
		}
	}
}


public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);

		primeiraConta.getSaldo();

		Conta segundaConta = primeiraConta;

		segundaConta.getSaldo();

		segundaConta.deposita(100);
		segundaConta.getSaldo();

		primeiraConta.getSaldo();

		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

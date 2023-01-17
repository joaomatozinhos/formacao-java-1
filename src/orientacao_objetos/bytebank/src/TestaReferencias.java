
public class TestaReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);

		System.out.println("Saldo primeira conta: R$" + primeiraConta.getSaldo());

		Conta segundaConta = primeiraConta;

		System.out.println("Saldo segunda conta: R$" + segundaConta.getSaldo());

		segundaConta.deposita(100);
		System.out.println("Saldo segunda conta: R$" + segundaConta.getSaldo());

		System.out.println("Saldo primeira conta: R$" + primeiraConta.getSaldo());

		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

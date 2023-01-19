
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(2678, 38556);
		primeiraConta.deposita(3264.78);
		System.out.println("Saldo primeira conta: R$" + primeiraConta.getSaldo());

		Conta segundaConta = new Conta(33218, 48473);
		segundaConta.deposita(2156.50);
		System.out.println("Saldo segunda conta: R$" + segundaConta.getSaldo());

		// System.out.println(primeiraConta.agencia);
		// System.out.println(primeiraConta.titular);

	}

}

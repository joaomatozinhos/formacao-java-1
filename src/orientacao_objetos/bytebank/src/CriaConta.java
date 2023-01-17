
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(3264.78);
		System.out.println("Saldo primeira conta: R$" + primeiraConta.getSaldo());

		Conta segundaConta = new Conta();
		segundaConta.deposita(2156.50);
		System.out.println("Saldo segunda conta: R$" + segundaConta.getSaldo());

		// System.out.println(primeiraConta.agencia);
		// System.out.println(primeiraConta.titular);

	}

}

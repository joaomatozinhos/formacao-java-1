
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 3264.78;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 2156.50;
		System.out.println(segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);

	}

}

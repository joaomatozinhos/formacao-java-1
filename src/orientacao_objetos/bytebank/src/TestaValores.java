package orientacao_objetos.bytebank.src;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(2678, 38556);
		System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(8753, 56678);
		Conta conta3 = new Conta(1365, 26786);

		System.out.println("Número de contas criadas: " + Conta.getQuantidadeDeContas());

	}

}

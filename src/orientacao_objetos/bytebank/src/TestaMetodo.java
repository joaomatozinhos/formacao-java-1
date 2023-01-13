
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 6770.50;
		System.out.println("Saldo anterior: R$" + contaDoJoao.saldo);
		contaDoJoao.deposita(635.50);
		System.out.println("Saldo atual: R$" + contaDoJoao.saldo);

		boolean conseguiuRetirar = contaDoJoao.saca(1320);
		if (conseguiuRetirar) {
			System.out.println("Saldo atual: R$" + contaDoJoao.saldo);
		}
	}
}


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

		Conta contaDoClaudio = new Conta();
		contaDoClaudio.deposita(15000);

		boolean sucessoTransferencia = contaDoClaudio.transfere(2500, contaDoJoao);
		if (sucessoTransferencia) {
			System.out.println("Saldo atual conta Cláudio: R$" + contaDoClaudio.saldo);
			System.out.println("Saldo atual conta João: R$" + contaDoJoao.saldo);
		}
	}
}

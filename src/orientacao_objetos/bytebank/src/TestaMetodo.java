
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(6770.50);
		System.out.println("Saldo conta do João: R$" + contaDoJoao.getSaldo());
		contaDoJoao.deposita(635.50);
		System.out.println("Saldo conta do João: R$" + contaDoJoao.getSaldo());

		boolean conseguiuRetirar = contaDoJoao.saca(1320);
		if (conseguiuRetirar) {
			System.out.println("Saldo conta do João: R$" + contaDoJoao.getSaldo());
		}

		Conta contaDoClaudio = new Conta();
		contaDoClaudio.deposita(15000);

		boolean sucessoTransferencia = contaDoClaudio.transfere(2500, contaDoJoao);
		if (sucessoTransferencia) {
			System.out.println("Saldo conta do Cláudio: R$" + contaDoClaudio.getSaldo());
			System.out.println("Saldo conta do João: R$" + contaDoJoao.getSaldo());
		}
	}
}

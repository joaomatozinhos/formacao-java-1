package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado: R$" + valor);
	}

}

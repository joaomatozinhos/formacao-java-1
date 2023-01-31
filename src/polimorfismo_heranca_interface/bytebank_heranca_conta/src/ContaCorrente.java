package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public boolean saca(double valor) {
		// nesse método, ao sacar, há cobrança de uma taxa de 20 centavos.
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado: R$" + valor);
	}

}

package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado: R$" + valor);
	}

	@Override
	public String toString() {
		return "Conta Poupança, " + super.toString();
	}

}

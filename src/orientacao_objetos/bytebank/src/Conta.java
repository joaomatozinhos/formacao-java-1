public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado: R$" + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque de R$" + valor);
			return true;
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo indisponível.");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Transferência realizada.");
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Não foi possível realizar a transferência. Saldo indisponível.");
			return false;
		}
	}
}
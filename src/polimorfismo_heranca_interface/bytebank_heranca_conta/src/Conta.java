package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int quantidadeDeContas;

	public Conta(int agencia, int numero) {
		if (agencia >= 0 && numero >= 0) {
			System.out.println("Estou criando uma conta..");
			quantidadeDeContas++;

			this.agencia = agencia;
			this.numero = numero;
		} else {
			System.out.println("Valores inválidos.");
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getQuantidadeDeContas() {
		return Conta.quantidadeDeContas;
	}

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
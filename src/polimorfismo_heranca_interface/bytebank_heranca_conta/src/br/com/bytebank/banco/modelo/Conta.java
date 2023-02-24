package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author João Pedro Matozinhos
 * @version 0.1
 */

public abstract class Conta implements Comparable<Conta> {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int quantidadeDeContas;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
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

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 */
	public void saca(double valor) {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"Saque não realizado. Saldo indisponível. Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;

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

	@Override
	public boolean equals(Object ref) {

		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência: " + this.agencia + ", Saldo: R$" + this.saldo;
	}
}
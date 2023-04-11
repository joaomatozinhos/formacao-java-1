package desafios.projeto_basico_banco;

public class ContaBancaria {

	private String nomeDoTitular;
	private String tipoDeConta = "Corrente";;
	private double saldo;

	public ContaBancaria(String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.saldo = saldo;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void consultaSaldo() {
		System.out.println("Saldo atual: R$ " + this.saldo);
	}

	public void recebeValor(double valor) {
		this.saldo += valor;
		this.consultaSaldo();
	}

	public void transfereValor(double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new Exception("Saldo insuficiente para fazer essa transferência.");
		}
	}

	@Override
	public String toString() {
		return "Conta Bancária [Nome do titular: " + nomeDoTitular + ", Saldo: R$ " + saldo + "]";
	}

}

package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}
}

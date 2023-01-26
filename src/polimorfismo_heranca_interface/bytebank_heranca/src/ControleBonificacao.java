package polimorfismo_heranca_interface.bytebank_heranca.src;

public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}

}

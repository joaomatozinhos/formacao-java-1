package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Assistente extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}
}

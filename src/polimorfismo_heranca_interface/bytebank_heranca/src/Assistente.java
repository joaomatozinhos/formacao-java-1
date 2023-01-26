package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Assistente extends Funcionario {

	public double getBonificacao() {
		System.out.println("Executando o método getBonificacao da classe Assistente");
		return super.getBonificacao() + 100;
	}
}

package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Suporte extends Funcionario {

	public double getBonificacao() {
		System.out.println("Executando o método getBonificacao da classe Suporte");
		return 200;
	}
}

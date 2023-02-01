package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Executando o método getBonificacao da classe Gerente");
		return super.getSalario();
	}
}

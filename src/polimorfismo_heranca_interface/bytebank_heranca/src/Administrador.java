package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return super.getSalario() / 2;
	}

}

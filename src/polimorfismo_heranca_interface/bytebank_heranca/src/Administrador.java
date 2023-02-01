package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Administrador extends Funcionario implements Autenticavel {

	private String senha;

	@Override
	public double getBonificacao() {
		return super.getSalario() / 2;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

}

package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Gerente extends Funcionario implements Autenticavel {

	private String senha;

	public double getBonificacao() {
		System.out.println("Executando o método getBonificacao da classe Gerente");
		return super.getSalario();
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

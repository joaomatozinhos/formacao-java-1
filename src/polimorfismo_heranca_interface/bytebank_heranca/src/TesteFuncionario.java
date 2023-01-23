package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Pedro Matozinhos", "26326339320");

		funcionario.setSalario(3450.00);

		double bonificacao = funcionario.getBonificacao();
		System.out.println("A bonificação de " + funcionario.getNome() + ", cujo CPF é " + funcionario.getCpf()
				+ " e salário é R$" + funcionario.getSalario() + ", é de R$" + bonificacao);

	}

}

package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente();
		gerente.setNome("João Pedro Matozinhos");
		gerente.setCpf("26326339320");
		gerente.setSalario(3450.00);

		double bonificacao = gerente.getBonificacao();
		System.out.println("A bonificação de " + gerente.getNome() + ", cujo CPF é " + gerente.getCpf()
				+ " e salário é R$" + gerente.getSalario() + ", é de R$" + bonificacao);

	}

}

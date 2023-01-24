package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Ronaldo Fenômeno");
		gerente.setCpf("38353948932");
		gerente.setSalario(61000.00);

		System.out.println("O gerente " + gerente.getNome() + ", cujo CPF é " + gerente.getCpf()
				+ ", possui o salário de R$" + gerente.getSalario());

		gerente.setSenha("cabuloso");

		boolean autenticou = gerente.autentica("cabuloso");
		System.out.println(autenticou);
	}

}

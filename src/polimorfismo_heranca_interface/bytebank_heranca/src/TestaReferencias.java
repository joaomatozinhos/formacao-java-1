package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TestaReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(6500.00);

		Funcionario f = new Funcionario();
		f.setSalario(2400.00);

		Funcionario a = new Assistente();
		a.setSalario(1200.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(a);

		System.out.println(controle.getSoma());

	}

}

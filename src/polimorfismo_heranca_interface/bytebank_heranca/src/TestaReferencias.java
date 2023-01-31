package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TestaReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(6500.00);

		Funcionario a = new Assistente();
		a.setSalario(1200.00);

		Funcionario s = new Suporte();
		s.setSalario(800.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(a);
		controle.registra(s);

		System.out.println(controle.getSoma());

	}

}

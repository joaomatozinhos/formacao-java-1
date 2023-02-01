package polimorfismo_heranca_interface.bytebank_heranca.src;

public class TestaSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha("ab8812");

		Administrador adm = new Administrador();
		adm.setSenha("cd7710");

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);

	}

}
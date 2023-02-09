package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		String nome = "Sandro";
		// String outro = new String("Paulo");

		// nome.toUpperCase() // não funciona, pois está tentando alterar uma String

		String nomeUpper = nome.toUpperCase(); // funciona, pois está criando outra String

		String nomeChange = nome.replace("o", "a");

		char c = nome.charAt(2);

		int pos = nome.indexOf("d");

		String sub = nome.substring(1);

		int l = nome.length();

		boolean con = nome.contains("j");

		String empty = " ";
		String outroEmpty = empty.trim();
		boolean e = empty.isEmpty();
		boolean e2 = outroEmpty.isEmpty();

		System.out.println(nomeUpper);
		System.out.println(nomeChange);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(l);
		System.out.println(con);
		System.out.println(e);
		System.out.println(e2);

	}

}

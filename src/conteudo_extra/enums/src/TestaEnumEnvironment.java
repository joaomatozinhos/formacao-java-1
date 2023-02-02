package conteudo_extra.enums.src;

public class TestaEnumEnvironment {

	public static void main(String[] args) {

		Environment des = Environment.DES;
		Environment homo = Environment.HOMO;

		System.out.println(des.name());
		System.out.println(homo.name());

		System.out.println(des.getValor());
		System.out.println(homo.getValor());

		boolean ehIgual = des.equals(homo);
		System.out.println(ehIgual);

	}

}
package projeto_screen_match;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o seu filme favorito:");
		String filmeFavorito = leitura.nextLine();

		System.out.println("Qual o ano de lançamento?");
		int anoDeLancamento = leitura.nextInt();

		System.out.println("Digite a sua avaliação de 0 a 10 para o filme:");
		double avaliacao = leitura.nextDouble();

		System.out.println(filmeFavorito);
		System.out.println(anoDeLancamento);
		System.out.println(avaliacao);

		leitura.close();
	}

}

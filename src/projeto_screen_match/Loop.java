package projeto_screen_match;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		double nota = 0;
		double mediaAvaliacao = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a sua avaliação de 0 a 10 para o filme:");
			nota = leitura.nextDouble();
			mediaAvaliacao += nota;
		}

		mediaAvaliacao = mediaAvaliacao / 3;
		System.out.println("Média de avaliações: " + mediaAvaliacao);

	}

}

package primeiros_passos.sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		int nota = 8;
		int numeroDeFaltas = 12;
		boolean boaParticipacao = numeroDeFaltas <= 15;

		if (nota >= 7 && boaParticipacao) {
			System.out.println("parabéns! você é um excelente aluno.");
		} else {
			System.out.println("procure melhorar.");
		}
	}
}

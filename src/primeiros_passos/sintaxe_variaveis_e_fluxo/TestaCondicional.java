package primeiros_passos.sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		int nota = 8;
		if (nota > 7) {
			System.out.println("parabéns! você está acima da média.");
		} else if (nota >= 6) {
			System.out.println("você ficou na média");
		} else {
			System.out.println("infelizmente você está de recuperação.");
		}
	}
}

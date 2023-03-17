package java_collections.gerenciador_de_cursos.src.br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestaMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		Set<String> chaves = nomesParaIdade.keySet();
		chaves.forEach(nome -> System.out.println(nome));

		Collection<Integer> valores = nomesParaIdade.values();
		valores.forEach(idade -> System.out.println(idade));

		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		associacoes.forEach(associacao -> System.out.println(associacao.getKey() + " - " + associacao.getValue()));

	}
}

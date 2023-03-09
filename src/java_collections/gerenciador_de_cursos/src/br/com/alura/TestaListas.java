package java_collections.gerenciador_de_cursos.src.br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas {
	public static void main(String[] args) {
		ArrayList<String> aulas = new ArrayList<>();

		aulas.add("Modelando a classe Aula");
		aulas.add("Conhecendo mais de listas");
		aulas.add("Trabalhando com Cursos e Sets");
		aulas.add("Aprofundando em ArrayList");

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		aulas.forEach(aula -> System.out.println("Aula: " + aula));

		int totalElementos = aulas.size();
		System.out.println(totalElementos);

		Collections.sort(aulas);

		System.out.println(aulas);
	}
}

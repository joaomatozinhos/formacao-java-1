package java_collections.gerenciador_de_cursos.src.br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCursosJava8 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getQuantidadeDeAlunos));

		cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));

		cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
//			.map(c -> c.getQuantidadeDeAlunos())
			.map(Curso::getQuantidadeDeAlunos)
//			.forEach(total -> System.out.println(total));
			.forEach(System.out::println);

		int sum = cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
//			.mapToInt(c -> c.getQuantidadeDeAlunos())
			.mapToInt(Curso::getQuantidadeDeAlunos).sum();

		System.out.println("Soma: " + sum);
	}
}

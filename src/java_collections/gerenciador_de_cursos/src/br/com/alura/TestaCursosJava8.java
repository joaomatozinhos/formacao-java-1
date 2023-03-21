package java_collections.gerenciador_de_cursos.src.br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		System.out.println("==========");

		cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
//			.map(c -> c.getQuantidadeDeAlunos())
			.map(Curso::getQuantidadeDeAlunos)
//			.forEach(total -> System.out.println(total));
			.forEach(System.out::println);
		
		System.out.println("==========");

		int sum = cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
//			.mapToInt(c -> c.getQuantidadeDeAlunos())
			.mapToInt(Curso::getQuantidadeDeAlunos).sum();

		System.out.println("Soma: " + sum);
		
		System.out.println("==========");
		
        OptionalDouble average = cursos.stream()
        	.mapToInt(Curso::getQuantidadeDeAlunos)
            .average();

        System.out.println(average);
        
        System.out.println("==========");
		
        cursos.stream()
        	.filter(c -> c.getQuantidadeDeAlunos() >= 100)
        	.findFirst()
        	.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("==========");
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(c -> System.out.println(c));
		
		System.out.println("==========");
		
		cursos.stream()
		   .filter(c -> c.getQuantidadeDeAlunos() >= 100)
		   .findAny()
		   .ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("==========");
		
		cursos = cursos.stream()
			.filter(c -> c.getQuantidadeDeAlunos() >= 100)
			.collect(Collectors.toList());
	
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("==========");
		
		Map<String, Integer> mapa = cursos.stream() 
			.filter(c -> c.getQuantidadeDeAlunos() > 100) 
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getQuantidadeDeAlunos()));
		
		mapa.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	}
}

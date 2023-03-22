package java_collections.gerenciador_de_cursos.src.br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestaDataJava8 {
	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate copaDoMundo = LocalDate.of(2026, Month.JUNE, 11);

		int anos = copaDoMundo.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, copaDoMundo);
		System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e "
				+ periodo.getDays() + " dias para a Copa do Mundo de 2026.");

		LocalDate proximasCopaDoMundo = copaDoMundo.plusYears(4);
		System.out.println(proximasCopaDoMundo);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = copaDoMundo.format(formatador);
		System.out.println(valorFormatado);

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));

		YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
		System.out.println(anoEMes);

		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);

		ZonedDateTime timeZone = ZonedDateTime.now();
		System.out.println(timeZone);
	}
}

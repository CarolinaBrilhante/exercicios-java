package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 9.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno ("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 6.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno ("Maria", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		System.out.println("Distinct...");
		alunos.stream()
		.distinct() // irá filtrar os elementos por similaridade, excluindo os iguais. Para funcionar adequadamente é necessário implementar o hashCode e o equals na Classe. 
		.forEach(System.out::println);
	
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2) // qtd de elementos que deseja "pular".
			.limit(2) // qtd de elementos que deseja "ler".
			.forEach(System.out::println);
			
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7) // irá ler os elementos enquanto a condição for satisfeita, quando retornar falso irá encerrar a iteração independente do resultado dos itens posteriores. 
			.forEach(System.out::println);
	}
}

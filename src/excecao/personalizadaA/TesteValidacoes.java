package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) { // para fazer uso de combinações de exception mas sem tratar de maneira genérica pode-se usar sequência de "catch" ou usar "|" na declaração da condição e ir cumulando Exceptions.
			System.out.println(e.getMessage());		
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim :)");
	}
}

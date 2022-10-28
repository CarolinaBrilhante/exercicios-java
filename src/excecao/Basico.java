package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		// usando try e catch o programa será executado até o fim mesmo havendo uma exceção o fluxo de execução não será interrompido como quando é lançada uma exceção sem previsão.
		try { // inserir bloco de código que pode gerar erro
			imprimirNomeDoAluno(a1);
		} catch(Exception excecao) { // inserir bloco de código para tratamento do erro 
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usúario");
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: "+ e.getMessage());
		}
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}

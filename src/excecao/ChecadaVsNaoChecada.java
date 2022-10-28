package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) throws Exception { // quando a exceção checada não é tratada no método em que ela é declarada, a obrigação de tratar passa a ser do método que está chamando.
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção não checada ou não verificada não exige ser declarada na ass do método
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	} // para lançar uma exceção é necessário usar a palavra reservada "throw".
	
	// Exceção checada ou verificada irá exigir que além da palavra throw para lançar a exceção, eu também use a palavra "throws" e a classe da Exceção implementada na ass do método.
	static void geraErro2() throws Exception { // se a exceção for tratada com o try/catch ela não precisará ser declarada na ass do método
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}

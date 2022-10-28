package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams { // build operator

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print; // criando a referência de variável através de uma interface funcional   
//		Consumer<Integer> println = System.out::println; 
		
		Stream<String> langs = Stream.of("Java " , "Lua ", "JS\n"); // implementado a Stream usando o método estático Stream.off passando os valores literais
		langs.forEach(print);
		
		String [] maisLangs = {	"Python " , "Lips ", "Perl " , "Go\n"}; // criando a referência para uma Stream através de um Array
		
		Stream.of(maisLangs).forEach(print); // usando o mesmo método .of para criar a Stream mas passando um Array como referência
		Arrays.stream(maisLangs).forEach(print); // criando uma Stream através so método do Array e fazendo um Array  virar uma Stream
		Arrays.stream(maisLangs, 1, 4).forEach(print); // usa os indices para o retorno desejado, considera o primeiro e desconcidera a partir do último indice indicado 
		
		List<String> outrasLangs =Arrays.asList("C " , "PHP " , "Kotlin\n"); // criando uma Strema usando uma Collection tipo List
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
	//  Stream.generate(() -> "a").forEach(print);  ---- Essa é uma Stream de forma infinita, uma generate que recebe uma função do tipo suplair, que obrigatoriamente não recebe nenhum parâmetro mas retorna algo
	// Stream.iterate(0, n -> n +1).forEach(println); --- Outra forma de criar uma Stream infinita mas aqui usando a iteração na função a partir de uma valor semente declarado 	
	
	}
}
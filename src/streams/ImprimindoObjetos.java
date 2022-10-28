package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu","Gui","Luca", "Ana");
		
		// imprimir usando o indice
		System.out.println("Usando o indice... ");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}	
	
        // imprimir usando os objetos da lista (Lista como referência)
		System.out.println("\nUsando o forEach... ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		// imprimir usando o Iterator
		System.out.println("\nUsando o Iterator... ");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		// usando a Stream o laço interno já está definido
		System.out.println("\nUsandoStream..aprovados.");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); 
	}
	
}

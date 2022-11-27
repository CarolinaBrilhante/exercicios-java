package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>(); // O LinkedHashSet garante que a ordem de inclusão será mantida. Um conjunto ordenado por ordem de entrada. 

	public void adicionar(C chave, V valor) {
		if(chave == null) return; // O uso do return em método viod implicará na saída do método.
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		return parOpcional.isPresent()
				? parOpcional.get().getValor() : null;
	}

}

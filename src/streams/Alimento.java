package streams;

public class Alimento {

	final  String nome;
	final boolean contemGluten;
	final boolean temNoEstoque;
	final double quantidade;
	final boolean validade;
	
	public Alimento(String nome, boolean contemTringo, boolean temNoEstoque, double quantidade, boolean validade) {
		this.nome = nome;
		this.contemGluten = contemTringo;
		this.temNoEstoque = temNoEstoque;
		this.quantidade = quantidade;
		this.validade = validade;
	}
	
	
}

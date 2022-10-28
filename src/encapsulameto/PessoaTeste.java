package encapsulameto;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Nome", "Amoedo", 30);
		p1.setIdade(35);  // alterar
		p1.setNome("Nome");
		
		System.out.println(p1.getIdade());  // ler
		System.out.println(p1);  
		System.out.println(p1.getNomeCompleto());

		
	}

}

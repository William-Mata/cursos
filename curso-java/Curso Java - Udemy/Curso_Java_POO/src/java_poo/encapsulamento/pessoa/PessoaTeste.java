package java_poo.encapsulamento.pessoa;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		
		p1.setNome("william");
		p1.setIdade(23);
		
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
	}

}

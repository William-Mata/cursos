package entrada_saida_dados;

// importa a classe ioexception para entrada de dados
import java.io.IOException;

public class Entrada_Dados {

	public static void main(String[] args) throws IOException {
		
		// classe string para receber o nome digitado pelo usuario 
		String nome;
		
		// vetor de byte para receber os dados de entrada 
		byte[] valor = new byte[100]; 
		
		// saida de dados
		System.out.println("Digite seu nome: ");
		
		// recebe o valor digitado pelo usuario valor de entrada.
		System.in.read(valor);
		
		// passando o valor do vetor de byte para a string nome
		nome = new String(valor);
		
		// saida de dados
		System.out.println("Seu nome é: " + nome);
		
	}

}

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);

		String login, senha;

		System.out.print("Digite o login: ");
		login = dados.next();

		System.out.print("Digite a senha: ");
		senha = dados.next();

		System.out.println("Validando Usuario....");

		if ((login.equals("William")) && (senha.equals("Mata"))) {

			System.out.println("Logado com sucesso!");

		} else {

			if ((login.equals("William") == false) && (senha.equals("Mata") == false)) {

				System.out.println("Login e Senha incorretos.");

			} else {

				if (login.equals("William") == false) {

					System.out.println("Login incorreto.");

				} else {

					System.out.println("Senha incorreta.");
				}

			}

		}

		dados.close();
	}

}

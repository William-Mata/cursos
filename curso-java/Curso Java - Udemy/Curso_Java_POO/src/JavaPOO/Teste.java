package JavaPOO;

public class Teste {

	public static void main(String[] args) {
			
		Conta conta1 = new Conta(9788561, 0d, 2000d );
		Conta conta2 = new Conta();
		
		
		conta1.cliente.setNome("william");
		conta1.cliente.setCPF("17753605712");
		conta1.agencia.setCodigo(98888);
		
		
		
		System.out.print(conta1.cliente.getNome());
		System.out.print( conta1.cliente.getCPF());
		System.out.print(conta1.agencia.getCodigo());
		System.out.print(conta1.getNumeroConta());
		System.out.print(conta1.getLimite());
		System.out.print(conta1.consultaSaldo());
		
		conta1.depositar(50.00);
		conta1.sacar(10.0);
		conta1.depositar(-5);
		conta1.sacar(55);
		
		
		
		
		
	}

}

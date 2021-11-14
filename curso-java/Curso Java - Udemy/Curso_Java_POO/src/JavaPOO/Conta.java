package JavaPOO;

public class Conta{
	
	private int numeroConta;
	private double saldo, limite;
	Agencia agencia = new Agencia();
	Cliente cliente = new Cliente();

	
	public Conta() {
		
	}
	
	public Conta(int numeroConta, double saldo, double limite) {
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
		this.setLimite(limite);
		
	}
	
	public void depositar(double deposito) {
		System.out.print("\n\nValor do deposito: " + deposito);
		if(deposito > 0) {
			this.saldo += deposito;
			System.out.print("\nDeposito realizado com suceso!");
			System.out.print(this.consultaSaldo());
		
		}else {
			System.out.print("\nO Valor para deposito precisa ser acima de R$ 0,00.");
		}

	}
	
	public void sacar(double saque) {
		
		System.out.print("\n\nValor do saque: " + saque);
		if((this.getSaldo() >= saque) && (saque > 0)){
			
			this.setSaldo(this.getSaldo()-saque);
			System.out.print("\nSaque realizado com suceso! o valor do saque foi: ");
			System.out.print(this.consultaSaldo());
		
		}else {			
			System.out.print("\nValor indiponivel para saque, tente novamente.");
			System.out.print(this.consultaSaldo());
			
		}	
		
	}
	
	public double consultaSaldo( ) {
		System.out.print("\nSaldo da conta: ");
		return this.getSaldo();
	}
	
	
	public int getNumeroConta() {
		 System.out.printf("\nNúmero da conta: ");
		 return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		System.out.print("\nLimite da conta: ");
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}

package ExemplosAula;

public class AulaExemploConta {

	private int numeroConta;
	private double saldo;
	private double limite;
	//construtor
	public AulaExemploConta(int numeroConta, double saldo, double limite) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	//construtor
	
	public void sacar(double saque) {
		//saldo-=saque;
		System.out.println("Saldo atual:"+saldo);
		if(saque > saldo) {
			System.out.println("Saldo indisponível");
		}else {
			saldo-=saque;
			System.out.println("Saldo realizado");
		}
	}
	public void depositar(double deposito) {
		saldo+=deposito;
	}
	public void imprimirExtrato() {
		System.out.println("Conta "+numeroConta+" Seu saldo atual é: "+saldo+" Seu limite atual é: "+limite);
	}
	//encapsulamento - GETTERS AND SETTERS
	public int getNumeroConta() {
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
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//encapsulamento - GETTERS AND SETTERS
	
	
	
	
	
	
	
	
}

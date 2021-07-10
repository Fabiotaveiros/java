package classes;

public abstract class Conta {
	//Atributos da conta
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	//construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	//encapsulamento == getters and setters
	public int getNumero() {
		return numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	//METODOS
	
	public void creditar(double valorCredito) {
		
		this.saldo+= valorCredito;
	}
	public void debitar(double valorDebito) {
	
		if(valorDebito <=0) {
			System.out.println("impossível realizar operação, tente novamente");
		}
		else if(valorDebito > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Débito realizado com sucesso");
		}
		this.saldo-= valorDebito;
	}
	
	
	
	
	
	
	
	
	
	
}

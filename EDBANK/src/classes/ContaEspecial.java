package classes;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(int numero, String nomeCliente, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void usarLimite(Double valor) {
		
		super.creditar(valor); //credita o valor digitado no saldo
		this.limite-= valor; //limite vai ser o limite estipulado menos o valor digitado
		
	}
	
	
}

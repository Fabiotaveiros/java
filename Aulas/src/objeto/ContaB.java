package objeto;

public class ContaB {
	public String nome;
	public int numeroConta;
	public int senha;
	public String tipoConta;
	public int saldo;
	public boolean deposito;
	public boolean saque;
	public boolean saqueAux;
	
	public void depositar() {
		System.out.println("Você acaba de depositar 100 Reais");
		saldo=saldo + 100;
		System.out.println("Seu novo saldo é: "+saldo);
		//saldo=saldo + 100;
		deposito = true;
	}
	public void depositar(int acréscimo) {
		System.out.println("Você acaba de depositar "+acréscimo+" Reais");
		saldo=saldo + acréscimo;
		System.out.println("Seu novo saldo é: "+saldo);
		deposito = true;
	}
	public void sacar() {
		if(saldo>=100) {
		saque=true;
		}
		saldo= saldo - 100;
		System.out.println("Você acabou de sacar 100 reais");
		System.out.println("seu novo saldo é: "+saldo);
	}
	public void ContaEspecial() {
		if(saldo > 5000) {
			System.out.println("Você acaba de chegar a saldo 5000+, e agora faz parte da conta especial"
					+ ", parabéns");
		}else {
			System.out.println("Você deseja fazer um empréstimo?");
		}
	}
	
	
	
	
	
}

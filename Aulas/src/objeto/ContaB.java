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
		System.out.println("Voc� acaba de depositar 100 Reais");
		saldo=saldo + 100;
		System.out.println("Seu novo saldo �: "+saldo);
		//saldo=saldo + 100;
		deposito = true;
	}
	public void depositar(int acr�scimo) {
		System.out.println("Voc� acaba de depositar "+acr�scimo+" Reais");
		saldo=saldo + acr�scimo;
		System.out.println("Seu novo saldo �: "+saldo);
		deposito = true;
	}
	public void sacar() {
		if(saldo>=100) {
		saque=true;
		}
		saldo= saldo - 100;
		System.out.println("Voc� acabou de sacar 100 reais");
		System.out.println("seu novo saldo �: "+saldo);
	}
	public void ContaEspecial() {
		if(saldo > 5000) {
			System.out.println("Voc� acaba de chegar a saldo 5000+, e agora faz parte da conta especial"
					+ ", parab�ns");
		}else {
			System.out.println("Voc� deseja fazer um empr�stimo?");
		}
	}
	
	
	
	
	
}

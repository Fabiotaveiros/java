package Lista5;

import objeto.ContaB;
import objeto.cliente;

public class exercicio6Lista5 {

	public static void main(String[] args) {
		
		ContaB cliente1 = new ContaB();
		
		cliente1.nome = "Jessica";
		cliente1.tipoConta = "Poupanca";
		cliente1.senha = 108321;
		cliente1.saldo = 0;
		cliente1.numeroConta= 8218321;
		
		cliente1.depositar();
		cliente1.depositar();
		cliente1.sacar();
		cliente1.depositar();
		cliente1.depositar(5000);
		cliente1.ContaEspecial();
		System.out.println("Seu saldo final foi: "+cliente1.saldo);
		
		
		
		
		
		
		

	}

}

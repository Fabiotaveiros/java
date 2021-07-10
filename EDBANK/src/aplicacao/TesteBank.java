package aplicacao;

import java.util.Scanner;

import classes.ContaEspecial;
import classes.ContaPoupanca;

public class TesteBank {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor;
		String nome;
		int numero;
		
		System.out.println("Digite o nome do cliente: " );
		nome = leia.next();
		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		
		
		//ContaPoupanca cp1 = new ContaPoupanca(numero, nome, 15);
		ContaEspecial ce1 = new ContaEspecial (numero, nome, 1000);
		
		
		System.out.println("Cliente 1: "+ce1.getNomeCliente());
		System.out.println("Saldo atual: R$"+ce1.getSaldo());
		System.out.println("Digite o valor do Crédito :");
		valor = leia.nextDouble();
		ce1.creditar(valor);
		
		System.out.println("Saldo atual: R$"+ce1.getSaldo());
		System.out.println("Digite o valor do Débito :");
		valor = leia.nextDouble();
		if(ce1.getSaldo()<valor) {
			double auxValor = valor - ce1.getSaldo();
			ce1.usarLimite(auxValor);
			System.out.println("Limite atual é: R$"+ ce1.getLimite());
		}
		//valor = leia.nextDouble();
		ce1.debitar(valor);
		System.out.println("Saldo Atual: R$"+ce1.getSaldo());
	}

}

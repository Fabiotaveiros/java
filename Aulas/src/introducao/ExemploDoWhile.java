package introducao;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int numero=0;
	int x=1;
	int aux=1;
	
	System.out.println("Digite um numero positivo: ");
	numero =leia.nextInt();
	
	if(numero<=0) {
		System.out.println("Numero invalido!!!");
	}
	else {
		do {
			// 1+2+3+4+5+6+7
			//aux+=(aux+1)
			System.out.printf("%d+ ",x);
			x++;
			aux=aux+x;
		}
		while(x<numero);
		System.out.print(x);
		System.out.println(" = " +aux);
	}
}}

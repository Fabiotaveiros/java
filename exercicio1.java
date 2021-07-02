package Lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;
		int maiorNumero=0;
		System.out.println("Digite o primeiro número inteiro: ");
		num1=ler.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		num2=ler.nextInt();
		System.out.println("Digite o terceiro número inteiro: ");
		num3=ler.nextInt();
		if(num1>num2 && num1>num3) {
		System.out.println("O maior número digitado foi: "+num1);
		}
		else if(num2>num1 && num2>num3) {
		System.out.println("O maior número digitado foi: "+num2);
		}
		else if(num3>num1 && num3>num2) {
		System.out.println("O maior número digitado foi: "+num3);
		}
	}
}

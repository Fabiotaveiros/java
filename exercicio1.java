package Lista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;
		int maiorNumero=0;
		System.out.println("Digite o primeiro n�mero inteiro: ");
		num1=ler.nextInt();
		System.out.println("Digite o segundo n�mero inteiro: ");
		num2=ler.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro: ");
		num3=ler.nextInt();
		if(num1>num2 && num1>num3) {
		System.out.println("O maior n�mero digitado foi: "+num1);
		}
		else if(num2>num1 && num2>num3) {
		System.out.println("O maior n�mero digitado foi: "+num2);
		}
		else if(num3>num1 && num3>num2) {
		System.out.println("O maior n�mero digitado foi: "+num3);
		}
	}
}

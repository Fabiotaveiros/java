package introducao;

import java.util.Scanner;

public class leia {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
				
				int anoNascimento;
				String nome;
				double salario;
				//escreva ("Digite seu nome")
				System.out.println("Digite seu nome: ");
				nome = leia.next();
				System.out.println("Digite seu ano de nascimento: ");
				anoNascimento=leia.nextInt();
				System.out.println("Digite seu sal�rio: ");
				salario=leia.nextDouble();
				System.out.printf("\nOi %s, sua idade � %d anos e seu salario � %.2f reais", nome, (2021-anoNascimento), salario);
				
				
				
				
				
	}

}

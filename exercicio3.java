package Lista2;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int idade;
		int infantil;
		int juvenil;
		int adulto;
		System.out.println("Quantos anos você tem? : ");
		idade=ler.nextInt();
		if(idade>9 && idade<15){
			System.out.println("Você pertence a categoria infantil");
			}
		else if(idade>14 && idade<18) {
			System.out.println("Você pertence a categoria juvenil");
		}
		else if(idade>17 && idade<26) {
			System.out.println("Você pertence a categoria adulto");
		}
		else if(idade<9 && idade>=0) {
			System.out.println("Você pertence a nenhuma categoria");
		}
	}
}

package ExemplosAula;

import java.util.Scanner;

public class ExemploPessoa {
	public static void main(String args[]){
		Scanner leia = new Scanner(System.in);
		
		char sexo= ' ';
		int anoNascimento=0,ano2,ano3;
		String nome= " ", nome2= " ",nome3= " ";
		int maisVelho=0;
		for(int i=0;i<3;i++) {
		System.out.println("Qual é seu nome? "+ "");
		nome=leia.next();
		System.out.println("Qual é seu sexo? M/F/O"+ " ");
		sexo=leia.next().charAt(0);
		System.out.println("Qual seu ano de nascimento?"+ " ");
		anoNascimento=leia.nextInt();
		}
		if(anoNascimento > maisVelho) {
			anoNascimento=(2021-anoNascimento);
			maisVelho=anoNascimento;
			}
		System.out.println("Olá senhor(a) "+nome+" seu sexo é: "+sexo+" e você tem: "+(2021-anoNascimento)+" Anos");
		System.out.println("A pessoa mais velha dos três foi: "+maisVelho);
	}	
}

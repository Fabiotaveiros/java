package Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
	
		int idade=0;
		int pessoasMenosVinteeUm=0;
		int pessoasMaisCinquenta=0;
		int pessoas= -99;
		char op= ' ';
		while(idade!=-99){
			System.out.println("Qual a sua idade? ");
			idade=leia.nextInt();
			if(op!='n') {
				System.out.println("Deseja continuar? S|N");
				op=leia.next().toUpperCase().charAt(0);
				break;
			}
			if(idade<21) {
			pessoasMenosVinteeUm++;
			}
			if(idade>50) {
			pessoasMaisCinquenta++;
			}
		}
			System.out.println("Pessoas com menos de vinte e um: "+pessoasMenosVinteeUm);
			System.out.println("Pessoas com mais de cinquenta e um: "+pessoasMaisCinquenta);
	}
}

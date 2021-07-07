package programa;

import java.util.Scanner;

import objeto.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //instanciou um Scanner / teclado
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		int idadeTeste;
		
		
		System.out.println("Digite o nome: ");
		amigo1.nome = leia.next();
		System.out.println("Digite o sexo M/F/O: ");
		amigo1.sexo = leia.next().charAt(0);
		System.out.println("Qual seu ano de nascimento? : ");
		amigo1.anoNascimento = leia.nextInt();
		
		System.out.println("Idade : "+(2021-amigo1.anoNascimento));
		
		System.out.println("Amigo 2: ");
		System.out.println("Digite o nome: ");
		amigo2.nome = leia.next();
		amigo2.anoNascimento=2000;
		idadeTeste=amigo2.calcularIdade(2030);
		System.out.println(amigo1.nome+" sua idade é "+amigo1.calcularIdade());
		System.out.println(amigo2.nome+" sua idade é "+idadeTeste);
	}
}

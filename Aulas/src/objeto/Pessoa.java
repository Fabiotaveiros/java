package objeto;

public class Pessoa {
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	public void mostrarIdade() {
		System.out.println(2021 - anoNascimento); //Devolve pro programa mas depois encerra.
		if ((2021 - anoNascimento)>=18) {
			System.out.println("Você é adulto!!!!");
		}else {
			System.out.println("Você é criança.");
		}
	}
public int calcularIdade() {
	return 2021-anoNascimento; //sempre devolve pro programa principal
	}
public int calcularIdade(int anoAtual) {
	return anoAtual-anoNascimento; //sempre devolve pro programa principal
	}
}
package Lista5;

import objeto.Funcionario;

public class exercicio4Lista5 {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.areaQueAtua= "Administrativa";
		func1.credencial= "Ab19e1235";
		func1.nome = "Amanda";
		func1.Sexo = 'F';
		func1.horasTrabalhadas = 5;
		
		func1.trabalhar();
		func1.horario=15.00;
		func1.tirarPausa();
		System.out.println("Sua pausa acabou, volte ao trabalho.");
		func1.horario=15.30;
		func1.trabalhar();
		func1.horario=16.30;
		func1.trabalhar();
		func1.sairtrabalho();
		
		
		

	}

}

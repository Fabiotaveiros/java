package Lista5;

import objeto.Paciente;

public class exercicio7Lista5 {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente();
		//
		paciente1.nome = "Clinton";
		paciente1.sexo = 'M';
		paciente1.anoNascimento = 1998;
		paciente1.tipoDoen�a = "desconhecido";
		paciente1.alaTratamento= 'B';
		//
		paciente1.fazerExame();
		paciente1.fazerExame();
		paciente1.fazerExame();
		//
		System.out.println("Ap�s realizado tr�s exames");
		paciente1.tipoDoen�a = "Gastro-enterite aguda";
		System.out.printf("Sr "+ paciente1.nome+ " sexo masculino"+" tem: "+(2021-paciente1.anoNascimento)+" Anos "+"\n");
		paciente1.fazerLaudo();
	}

}

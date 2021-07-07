package objeto;

public class Paciente {

	public String nome;
	public char sexo;
	public int anoNascimento;
	public String tipoDoença;
	public char alaTratamento;
	public boolean laudo;
	public int exame=0;
	public int idade;
	
		public void fazerExame() {
			System.out.println("Realizando exames...");
			exame++;
	}
		public void fazerLaudo() {
			if(exame>=3) {
				laudo=true;
				System.out.println("o seu laudo deu que você tem: "+tipoDoença);
				System.out.println("Você vai ficar de recuperação 5 dias");
			}
			
		}
		public void calcularIdade() {
			idade=(2021-anoNascimento);
		}
}

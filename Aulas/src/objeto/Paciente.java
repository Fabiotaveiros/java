package objeto;

public class Paciente {

	public String nome;
	public char sexo;
	public int anoNascimento;
	public String tipoDoen�a;
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
				System.out.println("o seu laudo deu que voc� tem: "+tipoDoen�a);
				System.out.println("Voc� vai ficar de recupera��o 5 dias");
			}
			
		}
		public void calcularIdade() {
			idade=(2021-anoNascimento);
		}
}

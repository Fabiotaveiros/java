package objeto;

public class Funcionario {
	public String credencial;
	public String nome;
	public char Sexo;
	public String areaQueAtua;
	public boolean baterCartao;
	public double horario;
	public int horasTrabalhadas;
	public boolean horaPausa;
	
	public void tirarPausa() {
		if(horario>=15 && horario <16) {
			horaPausa=true;
			System.out.println("Você está de pausa");
		}else {
			System.out.println("Você não pode tirar pausa ainda");
		}
	}
	public void sairtrabalho() {
		if(horasTrabalhadas==8) {
			baterCartao=true;
		}
		System.out.println("Você bateu o cartão, até amanhã.");
}
	public void trabalhar() {
		horasTrabalhadas++;
	}
}


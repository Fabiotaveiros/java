package objeto;

public abstract class Animal {
	//Atributos da classe
	
	private String nomeAnimal;
	private int idadeAnimal;
	private boolean emiteSom;

	//constructor
	public Animal(String nomeAnimal, int idadeAnimal, boolean emiteSom) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.emiteSom = emiteSom;
	}
	//Getters and setters
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public int getIdadeAnimal() {
		return idadeAnimal;
	}
	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}
	public boolean getEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	public void locomover() {	
	}
	public void emitirSom() {
		
	}
}

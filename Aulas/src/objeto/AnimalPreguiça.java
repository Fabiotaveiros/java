package objeto;

public class AnimalPregui�a extends Animal {
private String corPelo;
private boolean garras = true;

public AnimalPregui�a(String nomeAnimal, int idadeAnimal, boolean emiteSom, boolean garras, String corPelo) {
	super(nomeAnimal, idadeAnimal, emiteSom);
	this.garras = garras;
}

public boolean isGarras() {
	return garras;
}

public void setGarras(boolean garras) {
	this.garras = garras;
}
	public void locomover() {
		System.out.println("Subindo em �rvore");
	}
	public void emitirsom() {
		System.out.println("Som de bicho-pregui�a");
	}
	
}

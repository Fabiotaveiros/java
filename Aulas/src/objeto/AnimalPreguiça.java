package objeto;

public class AnimalPreguiça extends Animal {
private String corPelo;
private boolean garras = true;

public AnimalPreguiça(String nomeAnimal, int idadeAnimal, boolean emiteSom, boolean garras, String corPelo) {
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
		System.out.println("Subindo em árvore");
	}
	public void emitirsom() {
		System.out.println("Som de bicho-preguiça");
	}
	
}

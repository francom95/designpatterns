package generic.composite;

public abstract class Componente {

	public boolean add(Componente componente) {
		return false;
	}
	
	public boolean remove(Componente componente) {
		return false;
	}
	
	public Componente getChild(int i) {
		return null;
	}
	
	public abstract void operation();
	
}

package generic.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Componente {

	private List<Componente> children;
	
	public Composite() {
		this.children = new ArrayList<Componente>();
	}
	
	public boolean add(Componente componente) {
		return children.add(componente);
	}
	
	public boolean remove(Componente componente) {
		return children.remove(componente);
	}
	
	public Componente getChild(int i) {
		if(i<=children.size()-1) {
			return children.get(i);
		}else return null;
	}
	
	@Override
	public void operation() {
		for(Componente componente: children) {
			componente.operation();
		}
	}

}

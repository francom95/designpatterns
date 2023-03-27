package generic.prototype;

public abstract class Prototype {

	private String genericVariable;
	
	protected Prototype(Prototype prototype) {
		this.genericVariable = prototype.getGenericVariable();
	}
	
	public abstract Prototype clone();

	public String getGenericVariable() {
		return genericVariable;
	}

	public void setGenericVariable(String genericVariable) {
		this.genericVariable = genericVariable;
	}
	
}

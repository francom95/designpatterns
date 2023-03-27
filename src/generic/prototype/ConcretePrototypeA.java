package generic.prototype;

public class ConcretePrototypeA extends Prototype{

	private String exampleVariable;
	
	public ConcretePrototypeA(ConcretePrototypeA prototype) {
		super(prototype);
		this.setExampleVariable(prototype.getExampleVariable());
	}
	
	@Override
	public Prototype clone() {
		return new ConcretePrototypeA(this);
	}

	public String getExampleVariable() {
		return exampleVariable;
	}

	public void setExampleVariable(String exampleVariable) {
		this.exampleVariable = exampleVariable;
	}

}

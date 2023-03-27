package generic.prototype;

public class ConcretePrototypeB extends Prototype{

	private String exampleVariableX;
	private String exampleVariableY;
	
	public ConcretePrototypeB(ConcretePrototypeB prototype) {
		super(prototype);
		this.exampleVariableX = prototype.getExampleVariableX();
		this.exampleVariableY = prototype.getExampleVariableY();
	}
	
	@Override
	public Prototype clone() {
		return new ConcretePrototypeB(this);
	}

	public String getExampleVariableX() {
		return exampleVariableX;
	}

	public void setExampleVariableX(String exampleVariableX) {
		this.exampleVariableX = exampleVariableX;
	}

	public String getExampleVariableY() {
		return exampleVariableY;
	}

	public void setExampleVariableY(String exampleVariableY) {
		this.exampleVariableY = exampleVariableY;
	}

}

package generic.decorator.theory;

public class ConcreteComponent implements Component{

	@Override
	public void execute() {
		System.out.println("ConcreteComponent execution");
	}

}

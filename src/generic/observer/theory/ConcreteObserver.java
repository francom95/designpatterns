package generic.observer.theory;

public class ConcreteObserver extends Observer {

	private Subject subject;
	private ObserverState observerState;
	
	public ConcreteObserver(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}

package generic.observer.theory;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers;
	
	public Subject() {
		this.observers = new ArrayList<Observer>();
	}
	
	public boolean attach(Observer observer) {
		return this.observers.add(observer);
	}
	
	public boolean detach(Observer observer) {
		return this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update();
		}
	}
	
}

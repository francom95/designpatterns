package generic.state;

public class Context {

	private State state;
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public void doThis() {
		this.state.doThis();
	}
	
	public void doThat() {
		this.state.doThat();
	}
	
}

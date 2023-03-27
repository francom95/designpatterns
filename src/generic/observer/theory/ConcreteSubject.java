package generic.observer.theory;

public class ConcreteSubject extends Subject{

	private SubjectState subjectState;

	public ConcreteSubject() {}
	
	public ConcreteSubject(SubjectState subjectState) {
		this.subjectState = subjectState;
	}
	
	public SubjectState getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(SubjectState subjectState) {
		this.subjectState = subjectState;
	}
	
}

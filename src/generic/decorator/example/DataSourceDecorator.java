package generic.decorator.example;

public abstract class DataSourceDecorator implements DataSource{

	private DataSource wrappee;
	
	protected DataSourceDecorator(DataSource wrappee) {
		this.wrappee = wrappee;
	}
	public void writeData(String data) {
		this.wrappee.writeData(data);
	}
	public String readData() {
		return this.wrappee.readData();
	}

}

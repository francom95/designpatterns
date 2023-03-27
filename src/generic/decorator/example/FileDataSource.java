package generic.decorator.example;

import java.util.Scanner;

public class FileDataSource implements DataSource{

	private String fileName;
	
	public FileDataSource(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void writeData(String data) {
		System.out.println(data);
	}

	@Override
	public String readData() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}

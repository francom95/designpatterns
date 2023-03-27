package generic.decorator.example;

public class Client {

	public static void main(String[] args) {
		DataSource source = new FileDataSource("file.dat");
		// archivo escrito con datos de ejemplo
		source.writeData("Example");
		
		// archivo escrito con datos de ejemplo comprimidos
		source = new CompressionDecorator(source);
		source.writeData("Example");

		// archivo escrito con datos de ejemplo comprimidos y encriptados
		source = new EncryptionDecorator(source);
		source.writeData("Example");
	}
	
}

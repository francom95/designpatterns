package generic.decorator.example;

public class EncryptionDecorator extends DataSourceDecorator{

	protected EncryptionDecorator(DataSource wrappee) {
		super(wrappee);
	}

	@Override
	public void writeData(String data) {
		String encryptedData = encrypt(data);
		super.writeData(encryptedData);
	}

	private String encrypt(String data) {
		return data + "_encrypted";
	}

	@Override
	public String readData() {
		String readData = super.readData();
		String decryptedData = decrypt(readData);
		return decryptedData;
	}
	
	public String decrypt(String data) {
		String decryptedData = data.split("_")[0]; // assuming that the only '_' is the one that uses to encrypt the data
		return decryptedData;
	}
}

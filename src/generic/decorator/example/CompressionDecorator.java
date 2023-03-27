package generic.decorator.example;

public class CompressionDecorator extends DataSourceDecorator{

	public CompressionDecorator(DataSource wrappee) {
		super(wrappee);
	}

	@Override
	public void writeData(String data) {
		String compressedData = compress(data);
		super.writeData(compressedData);
	}

	@Override
	public String readData() {
		String readData = super.readData();
		return decompress(readData);
	}
	
	public String compress(String data) {
		return data + "_compress";
	}
	
	public String decompress(String data) {
		return data.split("_")[0];
	}
	
}

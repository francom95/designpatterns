package generic.proxy;

public class Proxy implements ServiceInterface {

	private Service realService;
	
	public Proxy(Service realService) {
		this.realService = realService;
	}
	
	public boolean checkAccess() {
		return true;
	}
	
	@Override
	public void operation() {
		if(checkAccess()) {
			this.realService.operation();
		}
	}

}

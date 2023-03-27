package generic.observer.example;

public class Subscriber extends Observer {

	private YoutubeChannel subject;
	private String subscriberName;
	
	public Subscriber(YoutubeChannel subject, String subscriberName) {
		this.subject = subject;
		this.subscriberName=subscriberName;
	}
	
	@Override
	public void update() {
		System.out.println("New video posted " + subscriberName +".");
		System.out.println("Name of the video: " + subject.getLastVideoPosted());
	}

}

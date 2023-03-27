package generic.observer.example;

public class Test {

	public static void main(String[] args) {
		YoutubeChannel channel = new YoutubeChannel();
		Subscriber s1 = new Subscriber(channel, "Juan");
		Subscriber s2 = new Subscriber(channel, "Pepe");
		
		channel.addSubscriber(s1);
		channel.addSubscriber(s2);
		
		channel.addNewVideo("Video del patron observer.");
	}
	
}
